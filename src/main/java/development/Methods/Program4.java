package development.Methods;
// Method overloading : when a class consist of more than one method with same name and different argument.

public class Program4 {
    public static void dance(int a)
    {
        System.out.println("dance(int)");
    }
    public static void dance(boolean b)
    {
        System.out.println("dance(boolean)");
    }

    public static void main(String[] args) {
        dance(true);
        dance(3);
    }
}
