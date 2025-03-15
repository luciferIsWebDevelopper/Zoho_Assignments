package Assignment.Constructors;

public class MainEmployee {
    public static void main(String[] args) {
        Employee employee=new Employee(452,"Gurusamy",90,12,10);
        employee.addEmployees(employee);
        Employee employee1=new Employee(456,"Sai Prasath",50,11,2);
        employee1.addEmployees(employee1);
        employee.getEmp();
    }
}

