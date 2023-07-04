package arvin.java.io;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PrintStreamTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void flush() {
    }

    @Test
    void close() {
    }

    @Test
    void checkError() {
    }

    @Test
    void setError() {
    }

    @Test
    void clearError() {
    }

    @Test
    void write() {
    }

    @Test
    void testWrite() {
    }

    @Test
    void print() {
    }

    @Test
    void println() {
//        String s = "docs\\printStream.txt";
//        try {
//            System.setOut(new PrintStream(s));
//            System.out.println("hello world");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        try(PrintStream printStream = new PrintStream(new FileOutputStream("docs\\\\printStream.txt"))){
            printStream.println("hello world.");
            printStream.println("Are you ready?");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void printf() {
    }

    @Test
    void testPrintf() {
    }

    @Test
    void format() {
    }

    @Test
    void testFormat() {
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
}