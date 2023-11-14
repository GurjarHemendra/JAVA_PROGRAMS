package development.FileHandling;

import java.io.File;
import java.io.IOException;

public class B {
    public static void main(String[] args) throws IOException {
        //create a file
        String path="D:\\Diwali\\happydiwali.txt";
        File file=new File(path);
        if (file.exists())
        {
            System.out.println("File already present");
        }
        else{
            file.createNewFile();
            System.out.println("file created succesfully");
        }
    }
}
