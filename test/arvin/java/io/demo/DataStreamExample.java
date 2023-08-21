package arvin.java.io.demo;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DataStreamExample {
    /**
     * 使用DataInputStream和DataOutputStream读写原始数据类型到文件
     */
    public static void main(String[] args) {
        String fileName = "datafile.dat";

        try(DataOutputStream dos = new DataOutputStream(Files.newOutputStream(Paths.get(fileName)))){
            int intValue = 42;
            double doubleValue = 3.14;
            boolean booleanValue = true;

            dos.writeInt(intValue);
            dos.writeDouble(doubleValue);
            dos.writeBoolean(booleanValue);

            System.out.println("数据写入文件成功！");
        }catch (IOException e){
            System.out.println("发生IO异常：" + e.getMessage());
        }


        //从文件读取数据
        try(DataInputStream dis = new DataInputStream(Files.newInputStream(Paths.get(fileName)))){
            int intValue = dis.readInt();
            double doubleValue = dis.readDouble();
            boolean boolValue = dis.readBoolean();

            System.out.println("从文件读取的整数值：" + intValue);
            System.out.println("从文件读取的双精度值：" + doubleValue);
            System.out.println("从文件读取的布尔值： " + boolValue);
        }catch (IOException e){
            System.err.println("发生IO异常：" + e.getMessage());
        }
    }
}
