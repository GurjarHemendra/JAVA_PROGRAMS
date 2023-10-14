package development.inheritance.ConstructorChaining;

/* can we overload main method*/
public class D {

    public static void main()
    {
        System.out.println("1");
    }
    public static void main(String[] args) {
        System.out.println("2");
        main();
    }
}
