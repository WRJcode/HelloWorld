package arvin.java.io;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FileWriterTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void getEncoding() {
    }

    @Test
    void write() throws IOException {
        try(FileWriter fileWriter = new FileWriter("docs\\write.txt")){
            char[] chars = "hello,alvin.".toCharArray();
            fileWriter.write(chars);
            fileWriter.flush();
            fileWriter.write("Can i continue write?");
        }
    }

    @Test
    void testWrite() throws IOException {
        try(FileWriter fileWriter = new FileWriter("docs\\write.txt")){
            fileWriter.write("hello,world.\n");
            fileWriter.flush();
        }
    }

    @Test
    void testWrite1() throws IOException {
        try(FileWriter fileWriter = new FileWriter("docs\\write.txt")){
            //char[] chars = "hello,alvin.".toCharArray();
            fileWriter.write(97);
            fileWriter.flush();
        }
    }

    @Test
    void testWrite2() throws IOException {
        try(FileWriter fileWriter = new FileWriter("docs\\write.txt")){
            fileWriter.write('B');
            fileWriter.flush();
        }
    }

    @Test
    void flush() {
        //刷新缓冲区，数据没有写到文件里，只能写到缓冲区
    }

    @Test
    void close() {
    }

    @Test
    void append() throws IOException {
        try(FileWriter fileWriter = new FileWriter("docs\\write.txt")){
            fileWriter.append("hello,")
                    .append("world\n")
                    .append("you are welcome.")
                    .flush();
        }
    }

    @Test
    void testAppend() {
    }

    @Test
    void testAppend1() {
    }
}