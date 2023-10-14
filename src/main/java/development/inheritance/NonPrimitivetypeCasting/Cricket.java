package development.inheritance.NonPrimitivetypeCasting;

public class Cricket extends Games {
    public void run()
    {
        System.out.println("cricket run");
    }

    public static void main(String[] args) {
        Cricket c=new Cricket();
        c.run();
        c.play();

        // upcast from cricket to games (child to parent)

        Games g=c; //
        g.play();
        //g.run(); once we upcast to parent class then we cannot access the member of its child class.

        System.out.println(g);
        System.out.println(c);
    }
}
