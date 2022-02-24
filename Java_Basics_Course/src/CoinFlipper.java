import java.util.Random;

public class CoinFlipper {
    public static void main(String[] args){
        Random coinFlipper = new Random();
    
        double randomValue = coinFlipper.nextDouble();

        boolean coinIsHeads = randomValue < 0.5;
    
        System.out.println("Ready, Set, Flip....!!");
        if(coinIsHeads){
            System.out.println("You got HEADS!");
        }
        else{
            System.out.println("You got TAILS!");
        }
    }
}
   
