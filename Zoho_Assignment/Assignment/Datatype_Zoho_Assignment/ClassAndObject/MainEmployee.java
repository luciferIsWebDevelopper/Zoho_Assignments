package Assignment.ClassAndObject;

public class MainEmployee {
    public static void main(String[] args) {
        Employee employee=new Employee(452);
        employee.setEmployeeName("Gurusamy");
        employee.setTotalWorkingHourse(12);
        employee.setAssignedTask(12);
        employee.setCompletedTask(10);
        // employee.setEmployeeId(234);
        /*
         * But this statement Is Meaning less Employeee Can't be changed
         */
        System.out.println("Employee Id: "+employee.getEmployeeId());
        System.out.println("Employee Name: "+employee.getEmployeeName());
        System.out.println("Employee Total Working Hourse: "+employee.getTotalWorkingHourse());
        System.out.println("Employee Assigned Tasks: "+employee.getAssignedTask());
        System.out.println("Employee Completed Task: "+employee.getCompletedTask());
        employee.IsEmployeeRecommendedForHike();
        Employee employee1=new Employee(456);
        employee1.setEmployeeName("Sai Prasath");
        employee1.setTotalWorkingHourse(10);
        employee1.setAssignedTask(12);
        employee1.setCompletedTask(8);
        // employee1.setEmployeeId(234);
        /*
         * But this statement Is Meaning less Employeee Can't be changed
         */
        System.out.println("Employee Id: "+employee1.getEmployeeId());
        System.out.println("Employee Name: "+employee1.getEmployeeName());
        System.out.println("Employee Total Working Hourse: "+employee1.getTotalWorkingHourse());
        System.out.println("Employee Assigned Tasks: "+employee1.getAssignedTask());
        System.out.println("Employee Completed Task: "+employee1.getCompletedTask());
        employee1.IsEmployeeRecommendedForHike();

    }
}
