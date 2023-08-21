package arvin.java.io.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteLargeDataToFile {
    public static void main(String[] args) {
        String fileName = "output.txt";
        int numLines = 1000000;

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            for (int i = 1;i <= numLines;i++){
                String line = "This is line " + i;
                writer.write(line);
                writer.newLine();
            }
            System.out.println("数据写入文件成功!");
        } catch (IOException e){
            System.out.println("发生IO异常：" + e.getMessage());
        }
    }
}
