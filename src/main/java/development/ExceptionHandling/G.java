package development.ExceptionHandling;

public class G {
    public static void vote(int age)
    {
        if(age>=18)
        {
            System.out.println("Welcome to voting ..");
            System.out.println("please vote ...");
        }
        else
        {
            throw new NullPointerException("Go kid !! and watch pogo");

        }

    }

    public static void main(String[] args) {
        vote(14);
    }
}
/* difference between Throws and throw */
/* Exception Propogation ko padho*/