import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.InetAddress;
import java.net.UnknownHostException;


public class EchoClient {
    public static void main (String[] args) throws UnknownHostException, IOException{
        System.out.println("Echo Client...");
        InetAddress localHost = InetAddress.getLocalHost();
        Socket socket = new Socket (localHost,8000);
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		System.out.println ("We are connected to server.");
		dos.flush();
		socket.close();
    }

}