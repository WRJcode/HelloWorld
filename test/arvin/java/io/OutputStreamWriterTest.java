package arvin.java.io;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class OutputStreamWriterTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void write() throws IOException {
        try(Writer out = new OutputStreamWriter(System.out)){
            out.write("hello world\n");
            out.write("my name is alvin.\n");
        }
    }

    @Test
    void testWrite() {
    }

    @Test
    void testWrite1() {
    }

    @Test
    void testWrite2() {
    }

    @Test
    void append() {
    }

    @Test
    void testAppend() {
    }

    @Test
    void testAppend1() {
    }

    @Test
    void getEncoding() {
    }

    @Test
    void flushBuffer() {
    }

    @Test
    void flush() {
    }

    @Test
    void close() {
    }
}