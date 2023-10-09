package development.Constructor;

public class Program5 {
    static
    {
        System.out.println("sb-1");
    }
    int a;
    static int b;

    public void test()
    {
        System.out.println("non static method test");
    }

    Program5()
    {
        System.out.println("inside the constructor");
    }
    public static void main(String[] args) {
        Program5 a=new Program5();
        System.out.println(a);
        System.out.println(b);
        a.test();
    }
    {
        System.out.println("nsb-1");
    }
}
/*
*  question : (5 difference )
*   1. static varible vs nonstatic variable
*   2. static method and non static method
*   3. static block and ns block
*   4. no args constructor vs parameterised constructor
*   5. method overloading vs constructor overloading
*
* question : WAP that includes all static members and all ns members and get tthe trace of the program
*
*
*
*
* */