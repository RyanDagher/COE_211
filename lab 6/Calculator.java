import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

    // Constructor to initialize the calculator
    public Calculator() {
        // Get user input
        Scanner scanCalc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = scan.nextInt();

        switch (operator) {
            case "+":
                add(num1,num2);
                break;
            case "-":
                subtract(num1,num2);
                break;
            case "*":
                multiply(num1,num2);
                break;
            case "/":
                divide(num1,num2);
                break;
            default:
                break;
        }


        System.out.print("Input the second number: ");
        int num2 = scan.nextInt();
        scan.close();
        
        /**
         * Continue code here to ask for the first number, the operator, and the second number, IN THAT ORDER
         */

        // Decide on the operation to perform 


        /**
         * Insert code to decide on which function to call, based on the operator the user chose
         * Hint: Switch statement
         */
    }

    public String add(int a, int b) {
        num1=a;
        num2=b ;
        num=num1+num2;
        return num1 + "+" + num2 + "=" + num;

        /**

         * Enter logic
         */
    }

    public String subtract(int a, int b) {
        num1=a;
        num2=b ;
        num=num1-num2;
        return num1 + "-" + num2 + "=" + num;
        /**
         * Enter logic
         */
    }

    public String multiply(int a, int b) {
        num1=a;
        num2=b ;
        num=num1*num2;
        return num1 + "*" + num2 + "=" + num;
        /**
         * Enter logic
         */
    }

    public String divide(int a, int b) {
        num1=a;
        num2=b ;
        num=num1/num2;
        return num1 + "/" + num2 + "=" + num;
        /**
         * Enter logic
         */
    }
}