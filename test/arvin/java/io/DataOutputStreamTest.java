package arvin.java.io;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class DataOutputStreamTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void write() {
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
    void writeBoolean() {
    }

    @Test
    void writeByte() {
    }

    @Test
    void writeShort() {
    }

    @Test
    void writeChar() {
    }

    @Test
    void writeInt() throws IOException {
        try(DataOutputStream dataOutputStream = new DataOutputStream(Files.newOutputStream(Paths.get("docs\\dataInput.txt")))){
            dataOutputStream.writeInt(30);
        }
    }

    @Test
    void writeLong() throws IOException {

    }

    @Test
    void writeFloat() {
    }

    @Test
    void writeDouble() {
    }

    @Test
    void writeBytes() {
    }

    @Test
    void writeChars() {
    }

    @Test
    void writeUTF() {
    }

    @Test
    void testWriteUTF() {
    }

    @Test
    void size() {
    }
}