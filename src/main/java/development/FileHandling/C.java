package development.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class C {
    //write inside the file
    public static void main(String[] args) throws IOException {
        String path="D:\\Diwali\\happydiwali.txt";
        File file=new File(path);
        String message="Diwali is over now start study";
        FileWriter fw=new FileWriter(file);
        fw.write(message);
        fw.flush();

    }
}
