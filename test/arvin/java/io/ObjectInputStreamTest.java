package arvin.java.io;

import arvin.java.custom.Student;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class ObjectInputStreamTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void read() {
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
    void readObject() throws IOException {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(Paths.get("docs\\objects.txt")))){
            Student s;
            s = (Student) objectInputStream.readObject();
            System.out.println(s);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void readObjectOverride() {
    }

    @Test
    void readUnshared() {
    }

    @Test
    void defaultReadObject() {
    }

    @Test
    void readFields() {
    }

    @Test
    void registerValidation() {
    }

    @Test
    void resolveClass() {
    }

    @Test
    void resolveProxyClass() {
    }

    @Test
    void resolveObject() {
    }

    @Test
    void enableResolveObject() {
    }

    @Test
    void readStreamHeader() {
    }

    @Test
    void readClassDescriptor() {
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
    void readChar() {
    }

    @Test
    void readShort() {
    }

    @Test
    void readUnsignedShort() {
    }

    @Test
    void readInt() {
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
    void readFully() {
    }

    @Test
    void testReadFully() {
    }

    @Test
    void skipBytes() {
    }

    @Test
    void readLine() {
    }

    @Test
    void readUTF() {
    }

    @Test
    void readTypeString() {
    }
}