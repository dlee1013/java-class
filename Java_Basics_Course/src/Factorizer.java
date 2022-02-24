public class Factorizer {
    public boolean isPerfect(int number){
        if(number == 1){
            return false;
        }

        int sum = 1;
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                sum += i;
            }
        }
        if(sum == number){
            return true;
        }
        
        return false;
    }
    
    public boolean isPrime(int number){
        if(number % 2 == 0){
            return false;
        }
        return true;
    }
}
