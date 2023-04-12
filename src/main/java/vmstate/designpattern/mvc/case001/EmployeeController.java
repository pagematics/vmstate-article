package vmstate.designpattern.mvc.case001;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;
    
    // constructor
    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }
 
    // update view method
    public void updateView() {
        view.printEmployeeDetails(model.getName(), model.getDepartment());
    }
}
