import java.util.Scanner;

public class UserIOImpl implements UserIO{

    @Override
    public void print(String message) {
        // TODO Auto-generated method stub
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        // TODO Auto-generated method stub
        System.out.println(prompt);
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        return input;
    }

    @Override
    public int readInt(String prompt) {
        // TODO Auto-generated method stub
        System.out.println(prompt);
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        scan.close();
        return input;
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        // TODO Auto-generated method stub
        System.out.println(prompt);
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        boolean inRange = false;

        while(!inRange){
            if(input < max && input > min){
                System.out.println("Your number is in range!");
                inRange = true;
            }
            if(input > max){
                System.out.println("Your number is out of range! Pick a smaller number");
                inRange = false;
            }
            if(input < min){
                System.out.println("Your number is out of range! Pick a bigger number");
                inRange = false;
            }
        }
            
        scan.close();
        return input;
    }

    @Override
    public double readDouble(String prompt) {
        // TODO Auto-generated method stub
        System.out.println(prompt);
        Scanner scan = new Scanner(System.in);
        double input = scan.nextDouble();
        scan.close();
        return input;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        // TODO Auto-generated method stub
        System.out.println(prompt);
        Scanner scan = new Scanner(System.in);
        double input = scan.nextDouble();
        boolean inRange = false;

        while(!inRange){
            if(input < max && input > min){
                System.out.println("Your number is in range!");
                inRange = true;
            }
            if(input > max){
                System.out.println("Your number is out of range! Pick a smaller number");
                inRange = false;
            }
            if(input < min){
                System.out.println("Your number is out of range! Pick a bigger number");
                inRange = false;
            }
        }
            
        scan.close();
        return input;
    }

    @Override
    public float readFloat(String prompt) {
        // TODO Auto-generated method stub
        System.out.println(prompt);
        Scanner scan = new Scanner(System.in);
        float input = scan.nextFloat();
        scan.close();
        return input;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        // TODO Auto-generated method stub
        System.out.println(prompt);
        Scanner scan = new Scanner(System.in);
        float input = scan.nextFloat();
        boolean inRange = false;

        while(!inRange){
            if(input < max && input > min){
                System.out.println("Your number is in range!");
                inRange = true;
            }
            if(input > max){
                System.out.println("Your number is out of range! Pick a smaller number");
                inRange = false;
            }
            if(input < min){
                System.out.println("Your number is out of range! Pick a bigger number");
                inRange = false;
            }
        }
            
        scan.close();
        return input;
    }

    @Override
    public long readLong(String prompt) {
        // TODO Auto-generated method stub
        System.out.println(prompt);
        Scanner scan = new Scanner(System.in);
        long input = scan.nextLong();
        scan.close();
        return input;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        // TODO Auto-generated method stub
        System.out.println(prompt);
        Scanner scan = new Scanner(System.in);
        long input = scan.nextLong();
        boolean inRange = false;

        while(!inRange){
            if(input < max && input > min){
                System.out.println("Your number is in range!");
                inRange = true;
            }
            if(input > max){
                System.out.println("Your number is out of range! Pick a smaller number");
                inRange = false;
            }
            if(input < min){
                System.out.println("Your number is out of range! Pick a bigger number");
                inRange = false;
            }
        }
            
        scan.close();
        return input;
    }
    
}
