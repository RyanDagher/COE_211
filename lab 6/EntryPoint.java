import java.util.Scanner;
public class EntryPoint{
	public static void main (String[] args){
		String answer;
		int value;
		Scanner scan= new Scanner(Systen.in);
		do{
			System.out.print("Which service would you like to use?");
			value=scan.nextInt();
			scan.nextLine();
		if(value<=4 && value>=1) {
			switch (value){
			case 1:
				BasicWeek bw =new BasicWeek();
				bw.printDays();
				break;
				case2:
				AdvencedWeek aw =new AdvencedWeek();
				aw.printDays();
				break;
			case 3:
				Calculator calc= new Calculator ();
				System.out.println(calc);
				break;
			case 4:
				Employee emp = new Employee();
				System.out.println(emp);
				break;

			}
		}
		else{System.out.println("Please make sure you pick a number between 1 and 4");}
		System.out.println("Would you like to performe another operation? (y/n)");
		answer= scan.nextLine();
	}
		while(answer.equal("y"));
	}
}
		
	