package development.ExceptionHandling;

public class A2 {
    public static void main(String[] args) {
        /*try with resource*/
        try
        {
            System.out.println("try");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }

}
