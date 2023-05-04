package arvin.java.io;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.Buffer;
import java.nio.CharBuffer;
import java.nio.file.Files;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InputStreamReaderTest {


    public static void main(String[] args) throws IOException {

        //String res = "";

        File file = new File("C:\\Users\\wrjco\\Desktop\\ifi-board.txt");
        InputStream inputStream = new FileInputStream(file);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        String line;
        StringBuilder buffer = new StringBuilder();
        while ((line = bufferedReader.readLine()) != null) {
            buffer.append(line);
        }
        //res = buffer.toString();

        System.out.println(buffer);
        System.out.println(buffer.length());

    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void read() throws IOException {

        File file = new File("C:\\Users\\wrjco\\Desktop\\ifi-board.txt");
        InputStream inputStream = Files.newInputStream(file.toPath());
        Reader reader = new InputStreamReader(inputStream);

        int charInt = 0;
        while ( ( charInt =reader.read()) != -1){
            System.out.print((char) charInt);
        }

    }

    //BufferedReader中增加的方法,Reader系列使用了装饰设计模式
    @Test
    void readLine() throws IOException {
        File file = new File("C:\\Users\\wrjco\\Desktop\\ifi-board.txt");
        InputStream inputStream = Files.newInputStream(file.toPath());
        Reader reader = new InputStreamReader(inputStream);

        //创建缓冲数组
        char[] chars = new char[1024];
        //临时变量，存储read方法返回值
        int len = 0;

        while((len = reader.read(chars))!=-1){
            /*
            这里我们使用String的构造方法和使用String类的valueOf()方法都可以将char[]
            转换为String
             */
            String s = String.valueOf(chars,0,len);
            System.out.println(s);
        }
        reader.close();

    }

    @Test
    void testRead() throws IOException {
        File file = new File("C:\\Users\\wrjco\\Desktop\\ifi-board.txt");
        InputStream inputStream = Files.newInputStream(file.toPath());
        Reader reader = new InputStreamReader(inputStream);


        //创建缓冲数组
        char[] chars = new char[500];
        //临时变量，存储read方法返回值
        int len = 0;

        while((len = reader.read(chars,0,500))!=-1){
            String s = String.valueOf(chars,0,len);
            System.out.println(s);
        }
        reader.close();

    }

    @Test
    void testRead1() throws IOException {

        File file = new File("C:\\Users\\wrjco\\Desktop\\ifi-board.txt");
        InputStream inputStream = Files.newInputStream(file.toPath());
        Reader reader = new InputStreamReader(inputStream);

        //创建缓冲数组
        char[] chars = new char[1024];
        CharBuffer cb = CharBuffer.wrap(chars);
        int len = reader.read(cb);

        System.out.println(String.valueOf(cb.array(),0,len));
        reader.close();
    }

    @Test
    void skip() throws IOException {
        File file = new File("C:\\Users\\wrjco\\Desktop\\ifi-board.txt");
        InputStream inputStream = Files.newInputStream(file.toPath());
        Reader reader = new InputStreamReader(inputStream);

        reader.skip(20);

        //创建缓冲数组
        char[] chars = new char[1024];
        CharBuffer cb = CharBuffer.wrap(chars);
        int len = reader.read(cb);

        System.out.println(String.valueOf(cb.array(),0,len));
        reader.close();

    }

    @Test
    void ready() throws IOException {
        File file = new File("C:\\Users\\wrjco\\Desktop\\ifi-board.txt");
        InputStream inputStream = Files.newInputStream(file.toPath());
        Reader reader = new InputStreamReader(inputStream);

        boolean isReady = reader.ready();
        System.out.println(isReady);

        reader.close();
    }

    @Test
    void markSupported() throws IOException {
        File file = new File("C:\\Users\\wrjco\\Desktop\\ifi-board.txt");
        InputStream inputStream = Files.newInputStream(file.toPath());
        Reader reader = new InputStreamReader(inputStream);

        System.out.printf("是否支持mark/reset？ %b\n",reader.markSupported());
    }

    @Test
    void mark() throws IOException {
        File file = new File("C:\\Users\\wrjco\\Desktop\\ifi-board.txt");
        InputStream inputStream = Files.newInputStream(file.toPath());
        Reader reader = new InputStreamReader(inputStream);

        //将会捕捉到异常，打印java.io.IOException: mark() not supported

        try{
            reader.mark(18);
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    @Test
    void reset() throws IOException {
        File file = new File("C:\\Users\\wrjco\\Desktop\\ifi-board.txt");
        InputStream inputStream = Files.newInputStream(file.toPath());
        Reader reader = new InputStreamReader(inputStream);

        //将会捕捉到异常，打印java.io.IOException: reset() not supported

        try{
            reader.reset();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    @Test
    void getEncoding() {
    }



    @Test
    void testClose() {
    }
}