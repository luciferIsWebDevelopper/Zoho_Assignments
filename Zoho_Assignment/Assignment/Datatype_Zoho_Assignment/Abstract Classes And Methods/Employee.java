
abstract class AbstractEmployee {
    abstract int calculatePay(int dayOrHourWorked);
    void getEmployeeDetails() {
        System.out.println("Employee details are not available.");
    }
}
class AbstractHourlyEmployee extends AbstractEmployee {
    int calculatePay(int noOfHoursWorked) {
        int pay = noOfHoursWorked * 20;
        System.out.println("Hourly employee pay: $" + pay);
        return pay;
    }
    @Override
    void getEmployeeDetails() {
        System.out.println("Hourly employee details are available.");
    }
}
class AbstractSalariedEmployee extends AbstractEmployee {
    int calculatePay(int noOfDaysWorked) {
        int pay = noOfDaysWorked * 200;
        System.out.println("Salaried employee pay: $" + pay);
        return pay;
    }
    @Override
    void getEmployeeDetails() {
        System.out.println("Salaried employee details are available.");
    }
}
class AbstractEmployeeMain {
    public static void main(String[] args) {
        AbstractEmployee emp = new AbstractHourlyEmployee();
        emp.getEmployeeDetails();
        emp.calculatePay(20);
        emp = new AbstractSalariedEmployee();
        emp.calculatePay(25);
        emp.getEmployeeDetails();
    }
}
