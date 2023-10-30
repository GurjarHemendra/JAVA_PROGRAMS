package development.Interface;

public class Dimpl implements D{
    public void test()
    {
        System.out.println("test() from child classs");
    }

    public static void main(String[] args) {
            D obj= new Dimpl();
            obj.test();
    }
}
