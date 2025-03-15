package Assignment.Constructors;

import java.util.ArrayList;

public class Employee {
    String employeeName;
    long employeeId;
    long totalWorkingHourse;
    int assignedTask;
    int completedTask;
    static ArrayList<Employee> emp = new ArrayList<>();

    public static void getEmp() {
        for (int i = 0; i < emp.size(); i++) {
            Employee e = emp.get(i);
            System.out.println("Employee Id: " + e.getEmployeeId());
            System.out.println("Employee Name: " + e.getEmployeeName());
            System.out.println("Employee Total Working Hourse: " + e.getTotalWorkingHourse());
            System.out.println("Employee Assigned Tasks: " + e.getAssignedTask());
            System.out.println("Employee Completed Task: " + e.getCompletedTask());
            e.IsEmployeeRecommendedForHike();
        }
    }
    void addEmployees(Employee employee){
        emp.add(employee);
    }
    Employee(long employeeId, String employeeName, long totalWorkingHourse, int assignedTask, int completedTask) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.totalWorkingHourse = totalWorkingHourse;
        this.assignedTask = assignedTask;
        this.completedTask = completedTask;
    }

    Employee(int employeeId) {
        this.employeeId = employeeId;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    protected void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public long getTotalWorkingHourse() {
        return totalWorkingHourse;
    }

    public void setTotalWorkingHourse(long totalWorkingHourse) {
        this.totalWorkingHourse = totalWorkingHourse;
    }

    public int getAssignedTask() {
        return assignedTask;
    }

    public void setAssignedTask(int assignedTask) {
        this.assignedTask = assignedTask;
    }

    public int getCompletedTask() {
        return completedTask;
    }

    public void setCompletedTask(int completedTask) {
        this.completedTask = completedTask;
    }

    void IsEmployeeRecommendedForHike() {
        if (assignedTask - 2 <= completedTask)
            System.out.println("Recommended for Hike");
        else
            System.out.println("Not Recommended For Hike");
    }
}
