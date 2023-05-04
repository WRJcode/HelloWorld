package arvin.java.io.demo.piped.bytes;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedDemo {
    public static void main(String[] args) {
        PipedSender sender = new PipedSender();
        PipedReceiver receiver = new PipedReceiver();

        PipedOutputStream out = sender.getOutputStream();
        PipedInputStream in = receiver.getInputStream();

        try{
            out.connect(in);

            sender.start();
            receiver.start();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
