package arvin.java.io;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class DataInputStreamTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void read() throws IOException {
        try(DataInputStream dataInputStream = new DataInputStream(new FileInputStream("docs\\dataInput.txt"))){
            int code = 0;
            while((code = dataInputStream.read())!=-1){
                System.out.println(code);
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
    void testAvailable() {
    }

    @Test
    void testClose() {
    }

    @Test
    void readFully() {
    }

    @Test
    void testReadFully() {
    }

    @Test
    void skipBytes() {
    }

    @Test
    void readBoolean() {
    }

    @Test
    void readByte() {
    }

    @Test
    void readUnsignedByte() {
    }

    @Test
    void readShort() {
    }

    @Test
    void readChar() {
    }

    @Test
    void readInt() throws IOException {
        try(DataInputStream dataInputStream = new DataInputStream(Files.newInputStream(Paths.get("docs\\dataInput.txt")))){
            int code = 0;
            while(true){
                try{
                    code = dataInputStream.readInt();
                    System.out.println(code);
                } catch (EOFException ex){
                    //ex.printStackTrace();
                    System.out.println("输出结束");
                    break;
                }
            }
        }
    }

    @Test
    void readLong() {
    }

    @Test
    void readFloat() {
    }

    @Test
    void readDouble() {
    }

    @Test
    void readUTF() {
    }

    @Test
    void testReadUTF() {
    }
}