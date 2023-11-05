package development.ExceptionHandling;

public class D {
    public static void main(String[] args) {
        int a=10;
        int b=0;

        try
        {
            int c=a/b;
        }
        catch(ArithmeticException g){
            System.out.println(1);
        }
        catch( Exception e){
            System.out.println(2);
        }
    }
}
