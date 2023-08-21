package arvin.java.nio.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FileCompressionExample {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String compressedFile = "compressed.zip";

        try(FileOutputStream fos = new FileOutputStream(compressedFile);
            ZipOutputStream zipOut = new ZipOutputStream(fos);
            FileInputStream fis = new FileInputStream(sourceFile);
            FileChannel fileChannel = fis.getChannel()){

            ZipEntry zipEntry = new ZipEntry(sourceFile);
            zipOut.putNextEntry(zipEntry);

            ByteBuffer buffer = ByteBuffer.allocate(1024);
            //int bytesRead;
            while (fileChannel.read(buffer) != -1){
                buffer.flip();
                byte[] data = new byte[buffer.limit()];
                buffer.get(data);
                zipOut.write(data);
                buffer.clear();
            }

            zipOut.closeEntry();
            System.out.println("File compressed successfully.");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
