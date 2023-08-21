package arvin.java.nio.demo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class NIONetworkClient {
    public static void main(String[] args) {
        try {
            SocketChannel channel = SocketChannel.open();
            channel.connect(new InetSocketAddress("localhost",8080));

            String message = "Hello,Server!";
            ByteBuffer buffer = ByteBuffer.wrap(message.getBytes());

            channel.write(buffer);

            buffer.clear();
            channel.read(buffer);
            buffer.flip();

            System.out.println("Received from server!");

            while (buffer.hasRemaining()){
                System.out.println((char)buffer.get());
            }
            channel.close();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
