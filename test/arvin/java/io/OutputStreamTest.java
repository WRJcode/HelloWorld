package arvin.java.io;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;


class OutputStreamTest {

    private OutputStream outputStream = Files.newOutputStream(Paths.get("C:\\Users\\wrjco\\Desktop\\test.txt"));

    OutputStreamTest() throws IOException {
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void write() throws IOException {
        outputStream.write(97);
    }

    @Test
    void testWrite() throws IOException {
        byte[] bytes = new byte[5];
        bytes[0] = 97;
        bytes[1] = 98;
        bytes[2] = 99;
        bytes[3] = 100;
        bytes[4] = 101;
        outputStream.write(bytes);
    }

    @Test
    void testWrite1() throws IOException {
        byte[] bytes = new byte[5];
        bytes[0] = 97;
        bytes[1] = 98;
        bytes[2] = 99;
        bytes[3] = 100;
        bytes[4] = 101;
        outputStream.write(bytes,2,3);
    }

    @Test
    void flush() throws IOException {
        outputStream.flush();
    }

    @Test
    void close() {
    }
}