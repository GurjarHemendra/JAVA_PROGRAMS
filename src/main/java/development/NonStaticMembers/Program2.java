package development.NonStaticMembers;
/* Non static method : A method which is not prefixed by static keyword is called as Non static method*/
public class Program2 {

    public  void demo()
    {
        System.out.println("this is my NS method");
    }


    public static void main(String[] args) {
      // creating a object
        Program2 obj=new Program2();   // obj : Object reference variable name

        // how to call a NS method/variable    :   obj_ref_var.method_name();
        obj.demo();
    }

}
