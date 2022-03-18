import java.util.Scanner;
public class Employee{

	private String firstName;
	private String lastName;
	private int age;
	private double salary;

	public Employee(){
		Scanner scan= new Scanner(System.in);
		System.out.println("Please input the employee first name:");
		firstName=scan.nextLine();
		System.out.println("please input the employee last name:");
		lastName=scan.nextLine();
		System.out.println("please input the employee age:");
		age=scan.nextInt();
		System.out.println("Please input the employee salary");
		salary=scan.nextDouble();
		scan.nextLine();
	}

		public String toString() {
			String output= "Employee information"+ firstName +" "+ lastName +" "+ age +" "+ salary;
			return output;
		}

	}

