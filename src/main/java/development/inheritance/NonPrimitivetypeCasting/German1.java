package development.inheritance.NonPrimitivetypeCasting;

public class German1 extends Dog{
    public void big()
    {
        System.out.println("german usally have big body size");
    }

    public static void main(String[] args) {
        // try to createe the parent class object and downcast it
        Dog d=new Dog();
        German1 g=(German1)d;

    }
}
