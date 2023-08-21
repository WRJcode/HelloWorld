package arvin.java.io.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SerializationExample {
    public static void main(String[] args) {
        String fileName = "serialized_object.ser";

        Person person = new Person("Alice",30);

        //将对象序列化并保存到文件
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)))){
            oos.writeObject(person);
            System.out.println("对象序列化并保存到文件成功!");
        }catch (IOException e){
            System.err.println("发生IO异常：" + e.getMessage());
        }
    }
}
