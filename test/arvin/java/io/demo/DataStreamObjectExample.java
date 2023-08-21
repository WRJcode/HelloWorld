package arvin.java.io.demo;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DataStreamObjectExample {
    public static void main(String[] args) {
        String fileName = "people.dat";

        Path path = Paths.get(fileName);
        try(DataOutputStream dos = new DataOutputStream(Files.newOutputStream(path))){
            Person person1 = new Person("zhangsan",30);
            Person person2 = new Person("lisi",18);

            ObjectOutputStream oos = new ObjectOutputStream(dos);
            oos.writeObject(person1);
            oos.writeObject(person2);

            System.out.println("对象写入文件成功!");
        }catch (IOException e){
            System.err.println("发生IO异常：" + e.getMessage());
        }

        //从文件读取对象
        try(DataInputStream dis = new DataInputStream(Files.newInputStream(path))){
            ObjectInputStream ois = new ObjectInputStream(dis);
            Person person1 = (Person) ois.readObject();
            Person person2 = (Person) ois.readObject();

            System.out.println("从文件读取的对象1["+ person1 +"]：" + person1.getName() + ", " + person1.getAge());
            System.out.println("从文件读取的对象2["+ person2 +"]：" + person2.getName() + ", " + person2.getAge());
        }catch (IOException | ClassNotFoundException e){
            System.err.println("发生IO异常：" + e.getMessage());
        }
    }
}
