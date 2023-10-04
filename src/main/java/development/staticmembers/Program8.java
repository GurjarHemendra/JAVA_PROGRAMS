package development.staticmembers;
// can i initialise a static variable from a static block .
public class Program8 {
    static int b=15;

    // SIB : static initialiser block
    static
    {
        b=20;
    }

    public static void main(String[] args) {
        System.out.println(b);
    }
}
