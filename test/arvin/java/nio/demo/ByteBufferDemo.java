package arvin.java.nio.demo;

import java.nio.ByteBuffer;

public class ByteBufferDemo {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        buffer.put("Hello world".getBytes());

        buffer.flip();

        byte[] bytes = new byte[buffer.limit()];

        buffer.get(bytes);

        System.out.println(new String(bytes));
    }
}
