public class Employee {

	private String FirstName, LastName;
	private int Age;
	private double Salary;
    public Employee() {}
    public Employee (String Firstname, String Lastname, int Age, double Salary) {
this.FirstName=Firstname;
this.LastName=Lastname;
this.Age=Age;
this.Salary=Salary;

    }
    
    public String toString() {
    	return "Employee Information: "+Firstname+", "+Lastname+", "+Age+", "+Salary;
    }
}
	