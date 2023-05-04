package arvin.java.io;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PushbackInputStreamTest {

    /**
     * PushbackInputStream继承FilterInputStream
     */

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void read() {

        try(PushbackInputStream pushbackInputStream = new PushbackInputStream(Files.newInputStream(Paths.get("docs\\buff.txt")))){
            int code;
            while((code = pushbackInputStream.read())!=-1){
                System.out.print((char)code);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testRead() {
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
    void mark() {
    }

    @Test
    void reset() {
    }

    @Test
    void markSupported() {
    }

    @Test
    void unread() {

        byte[] fruits = {1,2,3,4,5,6,7,8,9,10};

        try(PushbackInputStream pushbackInputStream = new PushbackInputStream(new ByteArrayInputStream(fruits),10)){
            pushbackInputStream.unread(fruits,0,3);
            pushbackInputStream.unread(fruits,6,3);

            byte[] bytes1 = new byte[10];
            byte[] bytes2 = new byte[10];
            byte[] bytes3 = new byte[10];

            int l1 = pushbackInputStream.read(bytes1,0,5);
            int l2 = pushbackInputStream.read(bytes2,0,8);
            int l3 = pushbackInputStream.read(bytes3,0,9);

            System.out.println("bytes1: " + Arrays.toString(bytes1));
            System.out.println("bytes2: " + Arrays.toString(bytes2));
            System.out.println("bytes3: " + Arrays.toString(bytes3));

            System.out.println("读取了：" + l1);
            System.out.println("读取了：" + l2);
            System.out.println("读取了：" + l3);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testUnread() {
    }

    @Test
    void testUnread1() {
    }
}