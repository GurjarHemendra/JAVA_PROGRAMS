package development.staticmembers;
// can i call a static method from a static block
public class Program9 {

    public static void demo()
    {
        System.out.println("demo() called");
    }

    static
    {
       demo();
    }

    public static void main(String[] args) {
        System.out.println("inside main method");
    }
}
