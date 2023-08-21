package arvin.java.io.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine{
    public static void main(String[] args) {
        String fileName = "example.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 1;

            while((line = reader.readLine()) != null){
                System.out.println("Line " + lineNumber + ": " + line);
                lineNumber++;
            }
        } catch (IOException e) {
            System.out.println("发生IO异常： " + e.getMessage());
        }
    }
}
