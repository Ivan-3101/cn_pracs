import java.io.*;
import java.net.*;

public class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(3000);
            Socket s = ss.accept(); // Wait for a client to connect
            DataInputStream dis = new DataInputStream(s.getInputStream());
            
            System.out.println("Client connected!");
            String str = dis.readUTF(); // Read a message from the client
            System.out.println("message=" + str);

            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
