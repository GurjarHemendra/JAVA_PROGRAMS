package development.NonStaticMembers;
/*
* Non static block :   a block which is not prefixed by static keyword is called as NS block
*
*       {
*         //stmts
*        }
*
*
* */
public class Program3 {

    //non static block
    {
        System.out.println("NS BLOCK");
    }
    public static void main(String[] args) {
        Program3 ref=new Program3();
        System.out.println("main method");
    }
}
