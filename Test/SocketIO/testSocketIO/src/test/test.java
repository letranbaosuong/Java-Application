/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import io.socket.client.IO;
import static io.socket.client.IO.socket;
import io.socket.client.Socket;
import java.net.URISyntaxException;

/**
 *
 * @author Suong
 */
public class test {
    public Socket mSocket;
//    mSocket
    {
        try {
            mSocket = IO.socket("http://192.168.1.6:3000/");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
    
    mSocket.emit("android_gui_dieu_khien_led", led);

    
    
    
}
