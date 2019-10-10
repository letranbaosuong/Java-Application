
import io.socket.client.Manager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;

/**
 * Classe client usada para comunicaçao com o Server.js
 *
 * @author grecolima
 */
public class Client {
    // objeto socket

    private Socket socket = null;

//    Manager manager = new Manager(new URI("http://socket.com"));
//    io.socket.client.Socket socket = manager.socket("/my-namespace");
//
//    socket.connect ();
    public static void main(String[] args) throws UnknownHostException,
            IOException, ClassNotFoundException {
        // Instancia classe
        Client client = new Client();

        // Conexão socket TCP
        String ip = "localhost";
        int port = 6969;
        client.socketConnect(ip, port);

        // writes and receives the message
        String message = "message123";

        // Escreve mensagem
        System.out.println("Sending: " + message);
        String returnStr = client.echo(message);
        System.out.println("Receiving: " + returnStr);
        
        // In main()
        client.getSocket().close();
    }

    // Conecta com o socket
    void socketConnect(String ip, int port) throws UnknownHostException, IOException {
        System.out.println("Conectando socket...");
        this.socket = new Socket(ip, port);
    }

    // escreve e recebe mensagem no socket
    public String echo(String message) {
        try {

            // out & in 
            PrintWriter out = new PrintWriter(getSocket().getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(getSocket().getInputStream()));

            // escreve string no socket e lê linha
            out.println(message);
            String returnStr = in.readLine();
            return returnStr;

            // In echo()
//            out.close();
//            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    // obtem instância do socket
    private Socket getSocket() {
        return socket;
    }
}
