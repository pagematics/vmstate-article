package vmstate.designpattern.mvc.case001;

public class EmployeeView {
    public void printEmployeeDetails(String employeeName, String employeeDepartment) {
        System.out.println("Employee Details:");
        System.out.println("Name: " + employeeName);
        System.out.println("Department: " + employeeDepartment);
    }
}