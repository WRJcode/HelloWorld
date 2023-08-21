package arvin.java.io.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DeserializationExample {
    public static void main(String[] args) {
        String fileName = "serialized_object.ser";

        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get(fileName)))){
            Person person = (Person)ois.readObject();
            System.out.println("从文件中反序列化的对象：" + person.getName() + ", " + person.getAge());
        }catch (IOException | ClassNotFoundException e){
            System.err.println("发生IO异常或类为找到：" + e.getMessage());
        }
    }
}
