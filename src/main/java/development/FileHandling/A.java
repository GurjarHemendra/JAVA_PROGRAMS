package development.FileHandling;

import java.io.File;

public class A {
    public static void main(String[] args) {
        //creating a folder
        String path="D:\\Diwali";
        File file=new File(path);
        if (file.exists())
        {
            // file exists
            System.out.println("file already exists");
        }
        else
        {
            file.mkdir();
            System.out.println("new file created");
        }
    }
}
