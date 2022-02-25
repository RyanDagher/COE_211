import java.util.Scanner;
public class EntryPoint{
	public static void main (String[] args){
		Scanner scan= new Scanner(System.in);
		String FirstName, LastName;
		int Age;
		double Salary;

		System.out.println("please imput the employees First Name ");
		FirstName= scan.Nextline();
		System.out.println("please imput the employees Last Name ");
		LastName= scan.Nextline();
		System.out.println("please imput the employees age ");
		Age=scan.Nextint();
		System.out.println("please imput the employees salary");
		Salary=scan.Nextdouble();
		Employee emp = new Employee(FirstName, LastName,Age, Salary);
System.out.println(emp);
	}
}