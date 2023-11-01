import java.io.IOException;
import java.net.*;

public class MyDatagramServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(3000);

        byte[] buffer = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buffer, buffer.length);

        ds.receive(dp);

        String message = new String(dp.getData(), 0, dp.getLength());
        System.out.println("Message from client: " + message);

        ds.close();
    }
}
