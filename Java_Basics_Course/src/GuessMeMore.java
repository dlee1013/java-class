import java.util.Random;
import java.util.Scanner;

public class GuessMeMore {

    public static void main(String[] args) {
        int start = 4;
    int stop = 26;

    for(int i = start; i < stop; i++){
        System.out.println("beep!");
    }
        Random rng = new Random();
        Scanner scan = new Scanner(System.in);
        int random = rng.nextInt(100- -100) -100;

        System.out.println("I've chosen a number between -100 and 100. Bet you cant guess it!");
        int guess = scan.nextInt();
        boolean shit = false;
        System.out.println("Your guess: " + guess);
        while(!shit){
            if(guess == random){
                System.out.println("Wow, nice guess! That was it!");
                shit = true;
            }
            if (guess < random) {
                System.out.println("Ha, nice try - too low! Try again!");
                guess = scan.nextInt();
            }
            if(guess > random){
                System.out.println("Ha, nice try - too high! Try again!");
                guess = scan.nextInt();
            }
        }
        scan.close();
        
    }
}
