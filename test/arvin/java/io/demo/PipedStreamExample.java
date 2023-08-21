package arvin.java.io.demo;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamExample {
    public static void main(String[] args) {
        PipedInputStream pipedInputStream = new PipedInputStream();
        PipedOutputStream pipedOutputStream = new PipedOutputStream();

        try{
            pipedInputStream.connect(pipedOutputStream);

            Thread writerThread = new Thread(() -> {
                try{
                    String data = "Hello, Piped Stream!";
                    pipedOutputStream.write(data.getBytes());
                    pipedOutputStream.close();
                }catch (IOException e){
                    System.err.println("写入线程发生IO异常：" + e.getMessage());

                }
            });

            //创建并启动读取线程
            Thread readerThread = new Thread(() -> {
                try {
                    int byteData;
                    StringBuilder result = new StringBuilder();

                    while((byteData = pipedInputStream.read()) != -1){
                        result.append((char)byteData);
                    }
                    System.out.println("读取的数据:" + result.toString());
                    pipedInputStream.close();
                }catch (IOException e){
                    System.err.println("读取线程发生IO异常：" + e.getMessage());
                }
            });

            //启动线程
            writerThread.start();
            readerThread.start();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
