package arvin.java.io;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FilterOutputStreamTest {

    FilterOutputStream OUTPUT = new FilterOutputStream(new FileOutputStream("docs\\buff.txt"));

    FilterOutputStreamTest() throws FileNotFoundException {
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void write() throws IOException {
        OUTPUT.write("hell world".getBytes());
        OUTPUT.close();
    }

    @Test
    void testWrite() {
    }

    @Test
    void flush() {
    }

    @Test
    void close() {
    }

    @Test
    void testWrite1() {
    }
}