package development.inheritance.ConstructorChaining;

public class C {
    C(int a)
    {
        this("vadapao");
        System.out.println("C(int)");
    }

    C(String name)
    {
        System.out.println("C(String)");
    }


    public static void main(String[] args) {
        C obj=new C(10);
    }
}
