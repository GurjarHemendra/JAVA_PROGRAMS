package development.ExceptionHandling;

/* Finally block*/
public class A1 {
    public static void main(String[] args) {
        System.out.println("main method begins");
        try
        {
            int a=10/0;
        }
        catch(ArithmeticException c)
        {
            System.out.println(c);
        }
        finally
        {
            System.out.println("finally block executed");
        }
    }
}