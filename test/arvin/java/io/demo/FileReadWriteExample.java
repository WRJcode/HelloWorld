package arvin.java.io.demo;

import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) {
        String sourceFileName = "source.txt";
        String targetFileName = "target.txt";

        try {
            // 1. 从文件读取内容
            BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();

            // 2. 将内容写入到目标文件
            BufferedWriter writer = new BufferedWriter(new FileWriter(targetFileName));
            writer.write(content.toString());
            writer.close();

            System.out.println("文件读写成功！");
        } catch (IOException e) {
            System.err.println("发生IO异常：" + e.getMessage());
        }
    }
}
