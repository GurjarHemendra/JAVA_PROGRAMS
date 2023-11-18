package development.Multithreading;

public class E {
    public static void main(String[] args) {
        Runnable r1 = () -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("*");
            }
        };

        Runnable r2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("#");
            }
        };
        Runnable r3 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("$");
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        t1.start();
        t2.start();
        t3.start();
    }
}
