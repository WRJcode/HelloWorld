package arvin.java.io.demo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayStreamExample {
    public static void main(String[] args) {
        byte[] data = {65,66,67,68,69};

        try(ByteArrayOutputStream baos = new ByteArrayOutputStream()){
            baos.write(data);

            byte[] writtenData = baos.toByteArray();
            System.out.println("写入的字节数组数据：" + new String(writtenData));

            try(ByteArrayInputStream bais = new ByteArrayInputStream(writtenData)){
                int byteData ;
                StringBuilder result = new StringBuilder();
                while((byteData = bais.read())!= -1){
                    result.append((char) byteData);
                }
                System.out.println("从字节数组读取的数据:" + result.toString());
            }
        }catch (IOException e){
            System.err.println("发生IO异常：" + e.getMessage());
        }
    }
}
