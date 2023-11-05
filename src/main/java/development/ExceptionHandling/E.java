package development.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class E {
/*  Throws work for only checked exceptions - OPEN YOUR EYES AND READ */
    public static void main(String[] args) throws FileNotFoundException {
        FileReader obj=new FileReader("file.txt");
    }
}
