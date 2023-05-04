package arvin.java.io;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;


class BufferedReaderTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void read() throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("docs\\buff.txt"))){
            int charCode;
            while((charCode = bufferedReader.read())!=-1){
                System.out.print((char) charCode);
            }
        }
    }

    @Test
    void testRead() throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("docs\\buff.txt"))){
            int len = 0;
            String s;
            char[] buf = new char[1024];
            while((len = bufferedReader.read(buf))!=-1){
                 s = String.valueOf(buf,0,len);
                 System.out.println(s);
            }
        }
    }

    @Test
    void testRead1() throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("docs\\buff.txt"))){
            int len = 0;
            String s;
            char[] buf = new char[300];
            while((len = bufferedReader.read(buf,0,300))!=-1){
                s = String.valueOf(buf,0,len);
                System.out.println(s);
            }
        }
    }

    @Test
    void skip() throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("docs\\buff.txt"))){

            //先skip
            long skipLen = bufferedReader.skip(12);

            String s = null;
            while((s = bufferedReader.readLine())!=null){
                System.out.println(s);
            }
        }
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
    void readLine() throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("docs\\buff.txt"))){
            String s = null;
            while((s = bufferedReader.readLine())!=null){
                System.out.println(s);
            }
        }
    }

    @Test
    void lines() throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("docs\\buff.txt"))){
            StringBuilder sb = new StringBuilder();

            Stream<String> stream = bufferedReader.lines();
            stream.forEach(s -> sb.append(s).append("\n"));

            System.out.println(sb);


        }
    }
}