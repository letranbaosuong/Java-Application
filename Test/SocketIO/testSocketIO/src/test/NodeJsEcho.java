import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;
  
/**
 * Classe client usada para comunicaçao com o Server.js
 * @author grecolima
 */
public class NodeJsEcho {
  // objeto socket
  private Socket socket = null;
 
  public static void main(String[] args) throws UnknownHostException, 
  IOException, ClassNotFoundException {
    // Instancia classe
    Client client = new Client();
 
    // Conexão socket TCP
    String ip = "localhost";
    int port = 1111;
    client.socketConnect(ip, port);
 
    // Recebe mensagem 
    String mensagem = JOptionPane.showInputDialog("Escreva sua msg: ");
    
    // Escreve mensagem
    System.out.println("Enviando: " + mensagem);
    String retorno = client.echo(mensagem);
    System.out.println("Recebendo: " + retorno);
  }
 
  // Conecta com o socket
  private void socketConnect(String ip, int port) throws UnknownHostException, IOException {
    System.out.println("Conectando socket...");
    this.socket = new Socket(ip, port);
  }           
               
  // escreve e recebe mensagem no socket
  public String echo(String mensagem) {
    try {
    	
      // out & in 
      PrintWriter out = new PrintWriter(getSocket().getOutputStream(), true);
      BufferedReader in = new BufferedReader(new InputStreamReader(getSocket().getInputStream()));
 
      // escreve string no socket e lê linha
      out.println(mensagem);
      String retorno = in.readLine();
      return retorno;
                
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