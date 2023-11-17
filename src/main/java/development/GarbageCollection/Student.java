package development.GarbageCollection;

public class Student {
    String name="John";
    int id=123;


    protected void finalize()
    {
        System.out.println("object removed");
    }
    public static void main(String[] args) {
        System.out.println("1");
        Student s=new Student();
        System.out.println("name is "+s.name);
        s=null;
        System.out.println("2");
        System.gc();
       for (int i=0;i<6;i++)
       {
           System.out.println("hello");
       }
    }
}
