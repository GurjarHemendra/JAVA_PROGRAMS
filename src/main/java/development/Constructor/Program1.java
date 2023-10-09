package development.Constructor;

public class Program1 {

//    CONSTRUCTOR
    /*  constructor is a special ns member
    *   we can have two types
    *           1. no args constructor
    *           2. paramaterised constructor
    * */
    Program1()
    {
        System.out.println("Inside the constructor");

    }
    public static void main(String[] args) {
        Program1 obj=new Program1();
    }
}
