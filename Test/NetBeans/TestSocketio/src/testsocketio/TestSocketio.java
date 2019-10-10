/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsocketio;

import io.socket.IOAcknowledge;
import io.socket.IOCallback;
import io.socket.SocketIO;
import io.socket.SocketIOException;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Suong
 */
public class TestSocketio {

    private SocketIO socket;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            new TestSocketio();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public TestSocketio() throws Exception {
        socket = new SocketIO();
        socket.connect("http://127.0.0.1:3000/", (IOCallback) this);

        // Sends a string to the server.
        socket.send("Hello Server");

        // Sends a JSON object to the server.
        socket.send(new JSONObject().put("key", "value").put("key2",
                "another value"));

        // Emits an event to the server.
        socket.emit("event", "argument1", "argument2", 13.37);
    }

    public void onMessage(JSONObject json, IOAcknowledge ack) {
        try {
            System.out.println("Server said:" + json.toString(2));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void onMessage(String data, IOAcknowledge ack) {
        System.out.println("Server said: " + data);
    }

    public void onError(SocketIOException socketIOException) {
        System.out.println("an Error occured");
        socketIOException.printStackTrace();
    }

    public void onDisconnect() {
        System.out.println("Connection terminated.");
    }

    public void onConnect() {
        System.out.println("Connection established");
    }

    public void on(String event, IOAcknowledge ack, Object... args) {
        System.out.println("Server triggered event '" + event + "'");
    }

}
