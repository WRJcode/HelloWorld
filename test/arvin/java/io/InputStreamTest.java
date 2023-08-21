package arvin.java.io;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InputStreamTest {

    private final InputStream inputStream = Files.newInputStream(Paths.get("C:\\Users\\wrjco\\Desktop\\ifi-board.txt"));;

    InputStreamTest() throws IOException {
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void read() throws IOException {
        byte[] bytes = new byte[600];
        System.out.println(inputStream.read());
        System.out.println(inputStream.read(bytes));
        System.out.println(Arrays.toString(bytes));
    }


    @Test
    void skip() throws IOException {
        System.out.println(inputStream.skip(1000l));
    }

    @Test
    void available() throws IOException {
        System.out.println(inputStream.available());
    }

    @Test
    void close() throws IOException {
        inputStream.close();
    }

    @Test
    void mark() throws IOException {
        inputStream.mark(300);
    }

    @Test
    void reset() throws IOException {
        //报错：当流不支持mark和reset会报错
        FileInputStream inputStream1 = new FileInputStream("C:\\Users\\wrjco\\Desktop\\ifi-board.txt");
        inputStream1.reset();
    }

    @Test
    void markSupported() {
        System.out.println(inputStream.markSupported());
    }
}