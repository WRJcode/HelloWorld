package arvin.java.io;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.Buffer;

import static org.junit.jupiter.api.Assertions.*;

class BufferedWriterTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void write() throws IOException {
        try( BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("docs\\write.txt"))){
            bufferedWriter.write("hello ,how are you!");
        }
    }

    @Test
    void testWrite() throws IOException {
         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("docs\\write.txt"));
         bufferedWriter.write(" aasd asdgasdgsg dfafgasdf sdfg\n");
         bufferedWriter.flush();
         bufferedWriter.write('b');
         //bufferedWriter.close();

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
    void flushBuffer() {
    }

    @Test
    void newLine() throws IOException {

        //try-with-resource语法糖创建流，因流实现AutoClose接口，会自动调用close()方法
        //跳出try前一定会关闭流

        try( BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("docs\\write.txt"))){
            bufferedWriter.write("hello,alvin.");
            bufferedWriter.newLine();
            bufferedWriter.write("how are you?");
            bufferedWriter.newLine();
            bufferedWriter.write("I am fine.");
        }
    }

    @Test
    void flush() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("docs\\write.txt"));
        bufferedWriter.write(" aasd asdgasdgsg dfafgasdf sdfg\n");
        //并没有写进文件中，通过flush刷新缓冲区写入文件
        bufferedWriter.flush();
        bufferedWriter.write('b');

        //close()方法中调用了flush()方法，刷新了缓冲区
        //bufferedWriter.close();
    }

    @Test
    void close() {
    }

    @Test
    void testWrite3() {
    }

    @Test
    void testWrite4() {
    }

    @Test
    void testWrite5() {
    }

    @Test
    void testWrite6() {
    }

    @Test
    void testAppend2() {
        //append()方法是继承自Append接口而来，其实现调用了write方法
        //append()返回当前实例
    }

    @Test
    void testAppend3() {
    }

    @Test
    void testAppend4() {
    }

    @Test
    void testFlushBuffer() {
    }

    @Test
    void testNewLine() {
    }

    @Test
    void testFlush() {
    }

    @Test
    void testClose() {
    }
}