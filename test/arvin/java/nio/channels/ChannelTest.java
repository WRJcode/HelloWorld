package arvin.java.nio.channels;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

import static org.junit.jupiter.api.Assertions.*;

class ChannelTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void write(){
        //1.字节输出流通向目标文件
        try(FileOutputStream fos = new FileOutputStream("docs\\buff.txt")){

            //2.获取channel
            FileChannel fileChannel = fos.getChannel();

            //3.分配缓冲区
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            for (int i = 0;i < 10;i++){
                buffer.clear(); //清空缓冲区
                buffer.put(("hello,使用Buffer和channel实现写数据到文件中" + i + "\r\n").getBytes());

                //4.把缓冲区切换成写出模式
                buffer.flip();
                fileChannel.write(buffer);//将缓冲区的数据写入到文件通道

                System.out.println("写数据到文件中！");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void read(){
        //1.定义一个文件字节输入流与源文件接通
        try(FileInputStream fis = new FileInputStream("docs\\buff.txt")){
            FileChannel channel = fis.getChannel();

            int bufferSize = 1024 * 1024;
            ByteBuffer buffer = ByteBuffer.allocate(bufferSize);

            ByteBuffer bb = ByteBuffer.allocate(1024);

            //4.读取数据到缓冲区
            int bytesRead = channel.read(buffer);
            while(bytesRead != -1){
                buffer.flip();
                while(buffer.hasRemaining()){
                    byte b = buffer.get();
                    if (b == 10 || b == 13){
                        bb.flip();
                        //这里就是一个行
                        final String line = Charset.forName("utf-8").decode(bb).toString();
                        bb.clear();
                    } else{
                        if(bb.hasRemaining())
                            bb.put(b);

                    }

                }
                buffer.clear();

                bytesRead = channel.read(buffer);

                System.out.println(buffer);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void copy(){
        File srcFile = new File("docs\\buff.txt");
        File destFile = new File("docs\\new-buff.txt");

        try(FileInputStream fis = new FileInputStream(srcFile);FileOutputStream fos = new FileOutputStream(destFile)){
            FileChannel fisChannel = fis.getChannel();
            FileChannel fosChannel = fos.getChannel();

            ByteBuffer buffer = ByteBuffer.allocate(1024);

            while (fisChannel.read(buffer)>0){
                buffer.flip();
                fosChannel.write(buffer);
                buffer.clear();
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("复制完成！");
    }

    @Test
    void isOpen() {
    }

    @Test
    void close() {
    }
}