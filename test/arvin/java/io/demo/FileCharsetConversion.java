package arvin.java.io.demo;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileCharsetConversion{
    public static void main(String[] args) {
        String sourceFileName = "source_utf8.txt";
        String targetFileName = "target_iso8859.txt";

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get(sourceFileName)), StandardCharsets.UTF_8));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(Paths.get(targetFileName)), StandardCharsets.ISO_8859_1))){
            String line;
            while ((line = reader.readLine()) != null){
                //将UTF-8编码的数据读取并以ISO-8859-1编码写入文件
                writer.write(line);
                writer.newLine();
            }

            System.out.println("文件字符编码转换成功！");
        }catch (IOException e){
            System.err.println("发生IO异常：" + e.getMessage());
        }
    }
}
