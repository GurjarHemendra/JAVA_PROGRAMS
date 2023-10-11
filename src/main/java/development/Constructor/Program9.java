package development.Constructor;

public class Program9 {
    int a=10;
    static int b=20;


    public void test()
    {
        int a=30;
        System.out.println(a);
        System.out.println(this.a);
    }
    public static void main(String[] args) {
        Program9 ref=new Program9();
        ref.test();
    }
}
