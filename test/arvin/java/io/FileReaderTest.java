package arvin.java.io;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



class FileReaderTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getEncoding() {
    }

    @Test
    void read() throws IOException {

        try(FileReader fileReader = new FileReader("docs\\buff.txt")){
            int readPos = 0;
            while((readPos = fileReader.read())!=-1){
                System.out.print((char)readPos);
            }
        }

    }

    @Test
    void testRead() throws IOException {
        try(FileReader fileReader = new FileReader("docs\\buff.txt")){
            char[] buf = new char[1024];
            int len;

            while((len = fileReader.read(buf))!=-1){
                String s = String.valueOf(buf,0,len);
                System.out.println(s);
            }
        }
    }

    @Test
    void testRead1() throws IOException {
        try(FileReader fileReader = new FileReader("docs\\buff.txt")){
            char[] buf = new char[300];
            int len = 0;

            while((len = fileReader.read(buf,0,300))!=-1){
                String s = String.valueOf(buf,0,len);
                System.out.println(s);
            }
        }
    }

    @Test
    void ready() throws IOException {
        try(FileReader fileReader = new FileReader("docs\\buff.txt")){
            boolean isReady = fileReader.ready();
            System.out.println(isReady);
        }
    }

    @Test
    void close() {
    }



    @Test
    void skip() throws IOException {
        try(FileReader fileReader = new FileReader("docs\\buff.txt")){
            long skipLen = fileReader.skip(13);
            System.out.println(skipLen);

            char[] buf = new char[1024];
            int len;

            while((len = fileReader.read(buf))!=-1){
                String s = String.valueOf(buf,0,len);
                System.out.println(s);
            }
        }
        }


    @Test
    void markSupported() throws IOException {
        try(FileReader fileReader = new FileReader("docs\\buff.txt")){
            boolean markSupport = fileReader.markSupported();
            System.out.println(markSupport);
        }

    }

    @Test
    void mark()  {

        //java.io.IOException: mark() not supported

        try(FileReader fileReader = new FileReader("docs\\buff.txt")){
            fileReader.mark(5);
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    @Test
    void reset() {
        //java.io.IOException: reset() not supported

        try(FileReader fileReader = new FileReader("docs\\buff.txt")){
            fileReader.reset();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}