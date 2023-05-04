package arvin.java.io;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class BufferedOutputStreamTest {

      BufferedOutputStream OUTPUT = new BufferedOutputStream(new FileOutputStream("E:\\others-project\\HelloWorld\\test\\arvin\\java\\io\\buff.txt"));

    BufferedOutputStreamTest() throws FileNotFoundException {
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void write() throws IOException {
        OUTPUT.write("hello world".getBytes());
        OUTPUT.close();
    }

    @Test
    void testWrite() {
    }

    @Test
    void testWrite1() {
    }

    @Test
    void flush() {
    }

    @Test
    void close() {
    }

    @Test
    void testWrite2() {
    }

    @Test
    void testWrite3() {
    }

    @Test
    void testFlush() {
    }

    @Test
    void testClose() {
    }

    @Test
    void testWrite4() {
    }

    @Test
    void testWrite5() {
    }

    @Test
    void testFlush1() {
    }

    @Test
    void testWrite6() {
    }

    @Test
    void testWrite7() {
    }

    @Test
    void testWrite8() {
    }

    @Test
    void testFlush2() {
    }

    @Test
    void testClose1() {
    }
}