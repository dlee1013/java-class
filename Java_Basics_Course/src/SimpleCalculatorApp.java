import java.util.Scanner;

public class SimpleCalculatorApp {
    public static void main(String[] args) {
        System.out.println("Input first number");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        System.out.println("Input second number");
        int b = scan.nextInt();
        scan.nextLine();

        System.out.println("What would you like to do with these numbers?");
        
        SimpleCalculator calculator = new SimpleCalculator();
        boolean valid = false;
        while(!valid){
            System.out.println("Add, Subtract, Multiply, or Divide?");
            String operation = scan.nextLine();
            
            switch(operation.toUpperCase()){
                case "ADD": System.out.println("Answer: " + calculator.add(a, b)); 
                    valid = true;
                    break;
                case "SUBTRACT": System.out.println("Answer: " + calculator.subtract(a, b)); 
                    valid = true;
                    break;
                case "MULTIPLY": System.out.println("Answer: " + calculator.multiply(a, b)); 
                    valid = true;
                    break;
                case "DIVIDE": System.out.println("Answer: " + calculator.divide(a, b)); 
                    valid = true;
                    break;
                default: System.out.println("Invalid Operation. Try again");
                    valid = false;
                    break;
            }
        }
        
        scan.close();
    }
}
