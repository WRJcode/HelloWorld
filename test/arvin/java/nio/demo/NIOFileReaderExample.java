package arvin.java.nio.demo;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOFileReaderExample {
    public static void main(String[] args) {
        try{
            RandomAccessFile file = new RandomAccessFile("example.txt","r");

            FileChannel channel = file.getChannel();

            ByteBuffer buffer = ByteBuffer.allocate(1024);

            while(channel.read(buffer) > 0){
                buffer.flip();
                while (buffer.hasRemaining()){
                    System.out.println((char)buffer.get());
                }
                buffer.clear();
            }

            channel.close();
            file.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
