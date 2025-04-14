
public class Employee {
    void getEmployeeDetails() {
        System.out.println("Employee details are not available.");
    }
}
class HourlyEmployee extends Employee {
    @Override
    void getEmployeeDetails() {
        System.out.println("Hourly employee details are available.");
    }
}
class SalariedEmployee extends Employee {
    @Override
    void getEmployeeDetails() {
        System.out.println("Salaried employee details are available.");
    }
}
class Main {
    public static void main(String[] args) {
        Employee emp = new HourlyEmployee();
        emp.getEmployeeDetails(); 

        emp = new SalariedEmployee();
        
        emp.getEmployeeDetails(); 
    }
}
