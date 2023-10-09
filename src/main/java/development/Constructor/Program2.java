package development.Constructor;

public class Program2 {

    /* need to define parameterised constructor*/
    Program2(int a,int b){
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        Program2 obj=new Program2(5,2);
    }
}
