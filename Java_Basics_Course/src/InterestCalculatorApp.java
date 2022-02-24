import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class InterestCalculatorApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        InterestCalculator calculator = new InterestCalculator();
        System.out.print("How much do you want to invest? ");
        float invest = scan.nextInt();

        System.out.print("How many years are you investing? ");
        int years = scan.nextInt();

        System.out.print("What is the annual interest rate % growth? ");
        float interest = scan.nextInt();

        scan.close();
        System.out.println("Calculating...");
    
        Locale locale = new Locale("en", "US");      
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
                
        for(int i = 1; i < years + 1; i++){
            float principal = calculator.calcInterest(invest, interest);
            float earned = principal - invest;
            float newTotal = earned + invest;
            

            System.out.println("Year " + i + ":");

            System.out.println("Began with " + currencyFormatter.format(invest));
            invest = newTotal;
           
            System.out.println("Earned " + currencyFormatter.format(earned));
            
            System.out.println("Ended with " + currencyFormatter.format(newTotal) + "\n");
        }
    }
}
