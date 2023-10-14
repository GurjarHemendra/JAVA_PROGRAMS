package development.inheritance.MethodOverridding;

import java.sql.SQLOutput;

public class Update extends App {
    public void payment()
    {
        System.out.println("CC payments ");
        System.out.println("EMI on CC is avalable now");
        System.out.println("bajaj emi available");
    }

    public static void main(String[] args) {
            Update newFeature=new Update();
//            newFeature.payment();
    App app=newFeature;
    app.payment();


    }
}
