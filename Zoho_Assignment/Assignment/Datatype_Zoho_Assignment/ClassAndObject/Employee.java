package Assignment.ClassAndObject;

public class Employee {
    String employeeName;
    long employeeId;
    long totalWorkingHourse;
    int assignedTask;
    int completedTask;
    Employee(int employeeId){
        this.employeeId=employeeId;
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
    void IsEmployeeRecommendedForHike(){
        if(assignedTask-2<=completedTask) System.out.println("Recommended for Hike");
        else System.out.println("Not Recommended For Hike");
    }
}
