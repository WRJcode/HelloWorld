package arvin.java.nio.demo;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileCopyWithNIO{
    public static void main(String[] args) {
        try{
            Path sourcePath = Paths.get("source.txt");
            Path targetPath = Paths.get("target.txt");

            FileChannel sourceChannel = FileChannel.open(sourcePath, StandardOpenOption.READ);
            FileChannel targetChannel = FileChannel.open(targetPath,StandardOpenOption.CREATE, StandardOpenOption.WRITE);

            ByteBuffer buffer = ByteBuffer.allocate(1024);

            while(sourceChannel.read(buffer) > 0){
                buffer.flip();
                targetChannel.write(buffer);
                buffer.clear();
            }

            sourceChannel.close();
            targetChannel.close();
            System.out.println("文件拷贝完成");

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
