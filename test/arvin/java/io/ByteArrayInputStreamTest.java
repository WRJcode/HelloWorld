package arvin.java.io;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ByteArrayInputStreamTest {

    private static final byte[] ArrayLetters = {
            0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6A, 0x6B, 0x6C, 0x6D, 0x6E, 0x6F,
            0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 0x78, 0x79, 0x7A
    };

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void read() throws IOException {
        try(ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(ArrayLetters)){
            int code = 0;
            while((code = byteArrayInputStream.read())!=-1){
                System.out.print("0x"+Integer.toHexString(code)+ ":" + (char)code + "\t");
            }
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