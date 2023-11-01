package development.Object;

public class Demo {
    public static void main(String[] args) {
        Employee  e1=new Employee("rahul","01");
        System.out.println(e1);
        Employee e2=new Employee("Ajay","02");
        System.out.println(e2);
        Employee e3 =new Employee("Rajeev","03");
        System.out.println(e3.hashCode());


    }
}
