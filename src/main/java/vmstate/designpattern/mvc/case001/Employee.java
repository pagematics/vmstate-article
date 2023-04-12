package vmstate.designpattern.mvc.case001;

public class Employee {
    private String name;
    private String department;
    
    // constructor
    public Employee(String name, String department) {
        this.setName(name);
        this.setDepartment(department);
    }
   // getter and setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
