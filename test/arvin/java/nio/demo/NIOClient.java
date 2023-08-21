package arvin.java.nio.demo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class NIOClient {
    public static void main(String[] args) {
        try{
            SocketChannel socketChannel = SocketChannel.open();
            socketChannel.connect(new InetSocketAddress("localhost",8020));
            System.out.println("Connected to server.");

            String message = "Hello,server!";
            ByteBuffer buffer = ByteBuffer.wrap(message.getBytes());
            socketChannel.write(buffer);
            System.out.println("Sent to server:"  + message);

            socketChannel.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
