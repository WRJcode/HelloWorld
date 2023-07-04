package arvin.java.io.demo.sequencde;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;

public class SequenceInputStreamDemo {
    public static void main(String[] args) throws IOException {

        Collection<FileInputStream> list = new ArrayList<FileInputStream>();
        list.add(new FileInputStream("docs\\sequence1.txt"));
        list.add(new FileInputStream("docs\\sequence2.txt"));
        list.add(new FileInputStream("docs\\sequence3.txt"));

        Enumeration<FileInputStream> enumeration = Collections.enumeration(list);

        try(SequenceInputStream sequenceInputStream = new SequenceInputStream(enumeration)){
            int code = 0;
            while((code = sequenceInputStream.read())!=-1){
                System.out.print((char)code);
            }
        }

    }
}
