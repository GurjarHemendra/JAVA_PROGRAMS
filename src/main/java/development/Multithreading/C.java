package development.Multithreading;

public class C {
    public static void main(String[] args) {
        // create a lambda function
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
        t1.start();
        String name1=t1.getName();
        System.out.println("default name : "+name1);
        //change the name of the thread
        t1.setName("Maggi");
        System.out.println("user defined name "+t1.getName());

        // getting the thread id
        System.out.println("Thread id "+t1.getId());


        Thread t2=new Thread(r2);
        t2.start();

    }
}
