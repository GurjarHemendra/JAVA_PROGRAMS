package development.basic;

public class Program5 {
    public static void main(String[]args)
    {
        // Logical Operators
        boolean a=true;
        boolean b=false;
        System.out.println(a&&b); // false
        System.out.println(a&&a); // true
        System.out.println(b&&a); // false
        System.out.println(b&&b);  // false
        System.out.println("++++++++++++++++++");
        System.out.println(a||b);
        System.out.println(a||a);
        System.out.println(b||a);
        System.out.println(b||b);
        System.out.println("+++++++++++++++++++++");
        System.out.println(!false);
        System.out.println(!true);
    }
}
