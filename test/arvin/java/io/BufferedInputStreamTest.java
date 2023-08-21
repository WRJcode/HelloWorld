package arvin.java.io;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assertions.*;

class BufferedInputStreamTest {


    BufferedInputStream in = new BufferedInputStream(new FileInputStream(new File("C:\\Users\\wrjco\\Desktop\\ifi-board.txt")), 5);

    BufferedInputStreamTest() throws FileNotFoundException {
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    public static void main(String[] args)  {

        byte[] buffer = new byte[1024];
        BufferedInputStream bin = null;

        try{
            File file = new File("C:\\Users\\wrjco\\Desktop\\ifi-board.txt");

            InputStream in = Files.newInputStream(file.toPath());
             bin = new BufferedInputStream(in);

            int bytesRead = 0;

            //从文件中按字节读取内容，到文件尾部时read方法将返回-1
            while((bytesRead = bin.read(buffer)) != -1){

                //将读取的字节转为字符串对象
                String chunk = new String(buffer,0,bytesRead);
                System.out.println(chunk);
            }
        } catch (IOException ex){
            ex.printStackTrace();
        } finally {
            //关闭 BufferedInputStream
            try {
                if (bin != null)
                    bin.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Test
    void read() throws IOException {
        byte[] tmp = new byte[5];
        in.read(tmp,0,5);
        System.out.println("字节流的前五个字节为："  + new String(tmp));
    }

    @Test
    void testRead() {
    }

    @Test
    void testRead1() {
    }

    @Test
    void skip() {
    }

    @Test
    void available() {
    }

    @Test
    void close() {
    }

    @Test
    void mark() throws IOException {
        byte[] tmp = new byte[5];
        in.read(tmp,0,5);
        System.out.println("字节流的前五个字节为："  + new String(tmp));

        in.mark(6);

        in.read(tmp,0,5);
        System.out.println("字节流的前6-10个字节为："  + new String(tmp));
    }

    @Test
    void reset() throws IOException {
        byte[] tmp = new byte[5];
        in.read(tmp,0,5);
        System.out.println("字节流的前五个字节为："  + new String(tmp));

        in.mark(6);

        in.read(tmp,0,5);
        System.out.println("字节流的前6-10个字节为："  + new String(tmp));

        in.reset();
        System.out.printf("reset后读取的第一个字节为：%c",in.read());
    }

    @Test
    void markSupported() {
    }

    @Test
    void testRead2() {
    }

    @Test
    void testRead3() {
    }

    @Test
    void testSkip() {
    }

    @Test
    void testAvailable() {
    }

    @Test
    void testClose() {
    }

    @Test
    void testMark() {
    }

    @Test
    void testReset() {
    }

    @Test
    void testMarkSupported() {
    }

    @Test
    void testRead4() {
    }

    @Test
    void testRead5() {
    }

    @Test
    void testSkip1() {
    }

    @Test
    void available1() throws IOException {
        byte[] tmp = new byte[5];
        in.read(tmp,0,5);
        System.out.println("字节流的前五个字节为："  + new String(tmp));
        System.out.println(in.available());

        in.mark(6);

        in.read(tmp,0,5);
        System.out.println("字节流的前6-10个字节为："  + new String(tmp));
        System.out.println(in.available());

        in.reset();
        System.out.printf("reset后读取的第一个字节为：%c\n",in.read());
        System.out.println(in.available());
    }

    @Test
    void testMark1() {
    }

    @Test
    void testReset1() {
    }

    @Test
    void testMarkSupported1() {
    }

    @Test
    void testClose1() {
    }
}