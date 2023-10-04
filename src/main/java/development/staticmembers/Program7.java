package development.staticmembers;

public class Program7 {
    static int a;

    static
    {
        System.out.println("Static block ");
    }

    public static void demo()
    {
        System.out.println("demo() called ");
    }

    public static void main(String[] args) {
        System.out.println(a);
        demo();
    }
}
