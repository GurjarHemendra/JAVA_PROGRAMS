package development.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class D {
    // read from the file

    public static void main(String[] args) throws IOException {
        String path="D:\\Diwali\\happydiwali.txt";
        File file=new File(path);
        long size= file.length();
        char c[]=new char[(int)size];
        FileReader fr=new FileReader(file);
        fr.read(c);
        System.out.println(c);
    }
}
