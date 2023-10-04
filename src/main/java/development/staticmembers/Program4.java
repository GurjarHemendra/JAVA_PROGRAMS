package development.staticmembers;

public class Program4 {
    static int a=10;
    public static void main(String[] args) {
        int a=20;
        System.out.println(a);
        System.out.println(Program4.a);
        a=15;
        System.out.println(a);
        Program4.a=12;
        System.out.println(a);
        System.out.println(Program4.a);
    }
}
