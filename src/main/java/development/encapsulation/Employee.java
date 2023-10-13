package development.encapsulation;

public class Employee {
    String ename ;
    String empId;
    private double esal;
    //getter method
    public double getEsal()
    {
        return esal;
    }
    // setter method
    public void setEsal(double newSal)
    {
        this.esal=newSal;
    }
    Employee(String name , String id , double sal)
    {
        this.ename=name;
        this.empId=id;
        this.esal=sal;

    }
    public void details()
    {
        System.out.println("Employee name is "+this.ename);
        System.out.println("Employee Id is "+this.empId);
        System.out.println("Employee sal is "+this.esal);
    }
}
