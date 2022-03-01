import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class StateCapitals2 {
    public static void main(String[] args) throws Exception {
        Map<String, String> statesAndCapitals = new HashMap<>();
        Scanner scan = new Scanner(new BufferedReader(new FileReader("StateCapitals.txt")));
        Scanner input = new Scanner(System.in);

        while(scan.hasNextLine()){
            String currentLine = scan.nextLine();
            String[] tokens = currentLine.split("::");
            String states = "";
            String capitals = "";
            for(int i = 0; i < tokens.length; i++){
                if(i == 0 || i % 2 == 0){
                    states = tokens[i];
                }
                if(i % 2 == 1){
                    capitals = tokens[i];
                }
                statesAndCapitals.put(states, capitals);
            }
        }
        System.out.println("50 STATES & CAPITALS ARE LOADED.");
        System.out.println("================================");
        System.out.println("HERE ARE THE STATES :");

        Set<String> statesSet = statesAndCapitals.keySet();

        for(String s: statesSet){
            System.out.print(s + ", ");
        }

        System.out.println("\n\nLETS PLAY A GAME!");
        System.out.println("HOW MANY CAPITALS CAN YOU GUESS GIVEN A STATE?");
        int n = input.nextInt();
        System.out.println("\nOK!\n");
        System.out.println("READY TO TEST YOUR KNOWLEDGE?");
        input.nextLine();
        
        boolean correct = false;

        //create a list to get a random index out of the arraylist
        List<String> statesList = new ArrayList<>(statesSet);
        for(int i = 0; i < n; i++){
            int size = statesSet.size();
            int rand = new Random().nextInt(size);

            String randomState = statesList.get(rand);
            System.out.println("WHAT IS THE CAPITAL OF " + randomState);
            
            String guess = input.nextLine();
            if(statesAndCapitals.get(randomState).equals(guess)){    
                System.out.println("NICE WORK! " + guess + " IS CORRECT!");
                correct = true;
            }
            while(!correct){
                if(!statesAndCapitals.get(randomState).equals(guess)){
                    System.out.println(guess + " IS NOT CORRECT! TRY AGAIN");
                    correct = false;
                    guess = input.nextLine();
                }  
            }
            
        }

//        System.out.println("READY TO TEST YOUR KNOWLEDGE? WHAT IS THE CAPITAL OF 'Alaska'?");
//        String guess2 = input.nextLine();
        
//       if(statesAndCapitals.get("Alaska").equals(guess2)){
//            System.out.println("NICE WORK! " + guess2 + " IS CORRECT!");
//           correct = true;
//        }
//       while(!correct){
//            if(!statesAndCapitals.get("Alaska").equals(guess2)){
//                System.out.println(guess2 + " IS NOT CORRECT! TRY AGAIN");
//                correct = false;
//                guess2 = input.nextLine();
//           }
//        }
        input.close(); 
    }
}
