package development.inheritance.NonPrimitivetypeCasting;

public class German extends Dog{
    public void big()
    {
        System.out.println("german usally have big body size");
    }


    public static void main(String[] args) {
        German g=new German();
        Dog d=g;

        // downcast from dog to german { Parent to child}
        German g1=(German)d;
        g1.size();
        g1.big();
    }
}
