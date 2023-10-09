package development.Constructor;

public class Program8 {
/* Constructor overloading : when a class consist of more than one constructor with same name and different arguments.*/
    Program8(int a)
    {
        System.out.println("Constructor(int)");
    }
    Program8(String name)
    {
        System.out.println("constructor(String)");
    }
    public static void main(String[] args) {
        Program8 obj=new Program8(1);
    }
}
