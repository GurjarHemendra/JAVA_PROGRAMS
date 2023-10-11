package development.encapsulation;

public class Driver1 {
    public static void main(String[] args) {
        Employee arun=new Employee("arun","INF001",25000.25);
        arun.details();

        System.out.println(arun.getEsal());

        // update the salary
        arun.setEsal(35000);
        arun.details();
    }
}
