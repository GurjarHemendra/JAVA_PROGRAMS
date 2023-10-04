package development.CTS;

public class Program1 {
    public static void main(String[] args) {
        int i=0;
        while(i<5)
        {
            i++;
            System.out.println("inside while loop");
            if(i==2)
            {

                System.out.println("inside if");
                continue;
            }
            System.out.println("end of while");

        }
    }
}
