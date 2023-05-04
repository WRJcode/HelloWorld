package arvin.java.io;

import arvin.java.custom.Student;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class ObjectOutputStreamTest {

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
    void flush() {
    }

    @Test
    void close() {
    }

    @Test
    void useProtocolVersion() {
    }

    @Test
    void writeObject() throws IOException {
        Student student = new Student(20160305l,"alvin",18,"wuyi university","网络工程");
        System.out.println(student);
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(Paths.get("docs\\objects.txt")))){
            objectOutputStream.writeObject(student);
        }
    }

    @Test
    void writeObjectOverride() {
    }

    @Test
    void writeUnshared() {
    }

    @Test
    void defaultWriteObject() {
    }

    @Test
    void putFields() {
    }

    @Test
    void writeFields() {
    }

    @Test
    void reset() {
    }

    @Test
    void annotateClass() {
    }

    @Test
    void annotateProxyClass() {
    }

    @Test
    void replaceObject() {
    }

    @Test
    void enableReplaceObject() {
    }

    @Test
    void writeStreamHeader() {
    }

    @Test
    void writeClassDescriptor() {
    }

    @Test
    void testWrite1() {
    }

    @Test
    void drain() {
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
    void writeInt() {
    }

    @Test
    void writeLong() {
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
    void getProtocolVersion() {
    }

    @Test
    void writeTypeString() {
    }
}