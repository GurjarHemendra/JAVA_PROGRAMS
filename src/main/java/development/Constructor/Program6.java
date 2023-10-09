package development.Constructor;

public class Program6 {
    int a ; // ns variable

    {
        a=10;
    }

    public static void main(String[] args) {
        Program6 b=new Program6();
        System.out.println(b.a);
    }
}
