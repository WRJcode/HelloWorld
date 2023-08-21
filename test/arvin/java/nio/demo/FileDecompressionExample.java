package arvin.java.nio.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class FileDecompressionExample {
    public static void main(String[] args) {
        String compressedFile = "compressed.zip";
        String decompressedFile = "decompressed.txt";

        try (FileOutputStream fos = new FileOutputStream(decompressedFile);
             ZipInputStream zipIn = new ZipInputStream(Files.newInputStream(Paths.get(compressedFile)));
             FileChannel fileChannel = fos.getChannel()) {

            ZipEntry entry = zipIn.getNextEntry();
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            while (entry != null) {
                int bytesRead;
                while ((bytesRead = zipIn.read(buffer.array())) != -1) {
                    buffer.clear();
                    buffer.limit(bytesRead);
                    fileChannel.write(buffer);
                }
                entry = zipIn.getNextEntry();
            }

            System.out.println("File decompressed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
