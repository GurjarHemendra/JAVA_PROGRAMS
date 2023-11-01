package development.Object;

public class Employee {
    String name;
    String id;

    Employee(String name,String id)
    {
        this.name=name;
        this.id=id;
    }

    //overridding the toString method
    public String toString()
    {
        return this.name+this.id;
    }

   public int hashCode()
   {
       return 1232;
   }


}
