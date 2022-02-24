import java.util.Scanner;

public class FactorizerApp{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Factorizer factorizer = new Factorizer();

        System.out.print("What number would you like to factor? ");
        int factor = scan.nextInt();
        scan.close();

        System.out.println("The factors of " + factor + " are:");

        int factors = 0;
        for(int i = 1; i <= factor; i++){
            if(factor % i == 0){
                System.out.print(i + " ");
                factors++;
            }
        }
        System.out.println("\n" + factor + " has " + factors + " factors");

        if(factorizer.isPerfect(factor)){
            System.out.println(factor + " is a perfect number");
        }
        else{

            System.out.println(factor + " is not a perfect number");
        }
        if(factorizer.isPrime(factor)){
            System.out.println(factor + " is a prime number");
        }
        else{
            System.out.println(factor + " is not a prime number");
        }
    }
 }
 