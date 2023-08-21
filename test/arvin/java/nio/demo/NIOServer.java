package arvin.java.nio.demo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NIOServer {
    public static void main(String[] args) {
        try{
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.bind(new InetSocketAddress(8020));
            System.out.println("Server started,listening on port 8020");

            ExecutorService executor = Executors.newFixedThreadPool(10);

            while(true){
                SocketChannel clientSocketChannel = serverSocketChannel.accept();
                System.out.println("New client connected:" + clientSocketChannel.getRemoteAddress());

                executor.execute(() -> handleClient(clientSocketChannel));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void handleClient(SocketChannel clientSocketChannel){
        try{
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            while(clientSocketChannel.read(buffer) > 0){
                buffer.flip();
                byte[] data = new byte[buffer.limit()];
                buffer.get(data);
                System.out.println("Received from client:" + new String(data));
                buffer.clear();
            }
            clientSocketChannel.close();
            System.out.println("Client disconnected.");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
