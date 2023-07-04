package arvin.java.io;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.CharArrayReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CharArrayReaderTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void read() throws IOException {
        char[] chars = {'a','b','c','d','e','f','g','h'};
        try(CharArrayReader charArrayReader = new CharArrayReader(chars)){
            int code;
            while((code = charArrayReader.read())!=-1){
                System.out.print((char)code);
            }
        }
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
    void ready() {
    }

    @Test
    void markSupported() {
    }

    @Test
    void mark() {
    }

    @Test
    void reset() {
    }

    @Test
    void close() {
    }
}