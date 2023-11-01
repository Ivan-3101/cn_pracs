import java.io.*;
import java.net.*;

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 3000); // Connect to the server
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            System.out.println("Client is connected to the server!");   
            dout.writeUTF("Hello, Ivan!"); // Send the user's message to the server
            dout.flush(); // Ensure the message is sent
            dout.close();
            s.close();
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }
}
