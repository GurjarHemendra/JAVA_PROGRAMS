package development.Abstaction;

public class Child extends Program2{

    public static void main(String[]args)
    {
        Program2 obj=new Child();
        obj.demo();
    }   public void demo()
    {
        System.out.println("from child class");
    }

}
