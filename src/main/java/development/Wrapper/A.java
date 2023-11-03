package development.Wrapper;

public class A {

    public static void main(String[] args) {
        int a=10; // Object type
        Integer ref=  Integer.valueOf(a);  // boxing
        System.out.println(ref);

        int b=20;
        Integer ref1=b; // autoboxing
        System.out.println(ref1);

    }
}
