package development.Object;

public class B {
    int a;

    B(int a)
    {
        this.a=a;
    }

    public static void main(String[] args) {
        B obj=new B(1);
        System.out.println(obj);
        B obj1=new B(2);
        System.out.println(obj1);
        System.out.println(obj.equals(obj1)); // comapring address
        System.out.println(obj.equals(obj)); //comparing address of obj with obj

    }
}
