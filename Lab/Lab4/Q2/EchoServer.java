import java.io.DataInputStream ;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main (String args[]) throws IOException {
        System.out.println ("Echo Server is started !");
        try (ServerSocket echoServer = new ServerSocket(8080)){
           Socket clientSocket =  echoServer.accept();
           
           DataInputStream dis = new DataInputStream(clientSocket.getInputStream());
           System.out.println("Connected to Client");
           echoServer.close();
        }
        
    }
}