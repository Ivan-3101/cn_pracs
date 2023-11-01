import java.io.IOException;
import java.net.*;

public class MyDatagramClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();

        InetAddress ip = InetAddress.getByName("localhost");
        int port = 3000;
        byte[] buffer = "Hello Ivan".getBytes();
        
        DatagramPacket dp = new DatagramPacket(buffer, buffer.length, ip, port);

        ds.send(dp);
        ds.close();
    }
}
