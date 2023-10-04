package development.Methods;

public class Program3 {

    // product method which will return the product of two numbers
    public static int product(int a , int b)
    {
        int c=a*b;
        return c;
    }
    public static void main(String[] args) {
        // 1st case : directly using the value
        System.out.println(product(4,5));;

        // 2nd case: storing the value
        int res= product(7,7);
        System.out.println("result is "+res);
    }
}
