package vmstate.designpattern.mvc.case001;

public class Main {
    public static void main(String[] args) {
        // create model object
    	Employee employee = new Employee("John Doe", "HR");
        
        // create view object
    	EmployeeView view = new EmployeeView();
        
        // create controller object
    	EmployeeController controller = new EmployeeController(employee, view);
        
        // update view
        controller.updateView();
    }
}

