package development.Multithreading;

public class B extends Thread{
    @Override
    public void run() {
        for (int i=0;i<5;i++)
        {
            System.out.println("#");
        }

    }

    public static void main(String[] args) {
        A obj=new A();
        B obj1=new B();
        obj.start();
        obj1.start();
    }
}
