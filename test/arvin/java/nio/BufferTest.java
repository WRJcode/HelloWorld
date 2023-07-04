package arvin.java.nio;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.ByteBuffer;

import static org.junit.jupiter.api.Assertions.*;

class BufferTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test1(){
        ByteBuffer buf = ByteBuffer.allocate(1024);
        System.out.println("-----------------allocate()----------------");
        System.out.println(buf.position());// 0: 表示当前的位置为0
        System.out.println(buf.limit());// 1024: 表示界限为1024，前1024个位置是允许我们读写的
        System.out.println(buf.capacity());//1024：表示容量大小为1024

        //2. 利用 put() 存入数据到缓冲区中
        System.out.println("-----------------put()----------------");
        String str = "itheima";
        buf.put(str.getBytes());
        System.out.println(buf.position());// 7表示下一个可以写入的位置是7,因为我们写入的字节是7个,从0开始已经写了7个，位置为8的position为7
        System.out.println(buf.limit());// 1024：表示界限为1024，前1024个位置是允许我们读写的
        System.out.println(buf.capacity());//1024：表示容量大小为1024

        //3. 切换读取数据模式
        System.out.println("-----------------flip()----------------");
        buf.flip();
        System.out.println(buf.position());// 0: 读取的起始位置为0
        System.out.println(buf.limit());// 7: 表示界限为7，前7个位置有数据可以读取
        System.out.println(buf.capacity());// 1024:表示容量大小为1024

        //4. 利用 get() 读取缓冲区中的数据
        System.out.println("-----------------get()----------------");
        byte[] dst = new byte[buf.limit()];//创建一个界限为limit大小的字节数组
        buf.get(dst);//批量将limit大小的字节写入到dst字节数组中
        System.out.println(new String(dst, 0, dst.length));//结果为itheima

        System.out.println(buf.position());//7: 读取的位置变为7,因为前面的7个字节数据已经全部读取出去,下一个可读取的位置为7，从0开始的
        System.out.println(buf.limit());//7: 可读取的界限大小为7
        System.out.println(buf.capacity());// 1024: 表示容量大小为1024

        //5. rewind() : 可重复读
        System.out.println("-----------------rewind()----------------");
        buf.rewind();// 将位置设为为 0,从头开始读取
        System.out.println(buf.position());// 0
        System.out.println(buf.limit());// 7
        System.out.println(buf.capacity());// 1024

        //6. clear() : 清空缓冲区. 但是缓冲区中的数据依然存在，但是处于“被遗忘”状态
        System.out.println("-----------------clear()----------------");
        buf.clear();
        System.out.println(buf.position());// 0
        System.out.println(buf.limit());// 1024
        System.out.println(buf.capacity());// 1024
        System.out.println((char)buf.get());//i

        
    }

    @Test
    void capacity() {
    }

    @Test
    void position() {
    }

    @Test
    void testPosition() {
    }

    @Test
    void limit() {
    }

    @Test
    void reset() {
    }

    @Test
    void clear() {
    }

    @Test
    void flip() {
    }

    @Test
    void rewind() {
    }

    @Test
    void remaining() {
    }

    @Test
    void hasRemaining() {
    }

    @Test
    void isReadOnly() {
    }

    @Test
    void hasArray() {
    }

    @Test
    void array() {
    }

    @Test
    void arrayOffset() {
    }

    @Test
    void isDirect() {
    }

    @Test
    void nextGetIndex() {
    }

    @Test
    void testNextGetIndex() {
    }

    @Test
    void nextPutIndex() {
    }

    @Test
    void testNextPutIndex() {
    }

    @Test
    void checkIndex() {
    }

    @Test
    void testCheckIndex() {
    }

    @Test
    void markValue() {
    }

    @Test
    void truncate() {
    }

    @Test
    void discardMark() {
    }

    @Test
    void checkBounds() {
    }
}