package development.ExceptionHandling;

public class A {
    /*Example for arithmeticException : divide any number by 0 */
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            int c=a/b;
        } catch (ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("ArithmeticException handled");

        }
        System.out.println("bye");
    }
}
