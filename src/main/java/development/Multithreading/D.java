package development.Multithreading;

public class D {
    public static void main(String[] args) {
        Runnable r1=()->{
            for(int i=0;i<5;i++){
                System.out.println("*");
            }
        };

        Runnable r2=()->{
            for (int i=0;i<5;i++)
            {
                System.out.println("#");
            }
        };

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t2.setPriority(10);// setting the highest priority of thread 2
        t1.start();
        t2.start();
    }
}
