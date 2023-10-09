package development.Constructor;

public class Program4 {
   Program4(int a , int b)
   {
       System.out.println("parametrised constructor");
   }
    public static void main(String[] args) {
        Program4 ref=new Program4(5,2);
        System.out.println(ref);
    }
}
