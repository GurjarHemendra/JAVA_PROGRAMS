package development.ExceptionHandling;

public class C {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        int arr[]={1,2,3};
        try {
            try {
                System.out.println(arr[3]);
            }
            catch(ArrayIndexOutOfBoundsException f)
            {
                System.out.println("array exception handled");
            }
            int c=a/b;


        }
        catch(ArithmeticException f)
        {
            System.out.println("Arithmetic Exception handled");
        }


    }
}
