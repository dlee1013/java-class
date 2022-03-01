import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StateCapitals3 {

    public static class StateCapitalsApp{
        public static void main(String[] args) throws Exception{
            Map<String, Capital> statesAndCapitals = new HashMap<>();

            Scanner scan = new Scanner(new BufferedReader(new FileReader("MoreStateCapitals.txt")));
            int stateCounter = 0;
            while(scan.hasNextLine()){
                String currentLine = scan.nextLine();
                String[] tokens = currentLine.split("::");
                String state = "";
                Capital capital = new Capital();

                for(int i = 0; i < tokens.length; i++){
                    if(i == 0 || i % 4 == 0){
                        state = tokens[i];
                        stateCounter++;
                    }
                    if(i % 4 == 1){
                        capital.setName(tokens[i]);
                    }
                    if(i % 4 == 2){
                        capital.setPopulation(Integer.parseInt(tokens[i]));
                    }
                    if(i % 4 == 3){
                        capital.setSquareMileage(Double.parseDouble(tokens[i]));
                    }

                    statesAndCapitals.put(state, capital);
                }
            }


            System.out.println(stateCounter + " STATE/CAPITAL PAIRS LOADED.");
            System.out.println("==============================");

            Set<String> statesSet = statesAndCapitals.keySet();
            
            for(String s : statesSet){
                Capital capital = statesAndCapitals.get(s);
                String name = capital.getName();
                int population = capital.getPopulation();
                double squareMileage = capital.getSquareMileage();
                System.out.println(s + " - " + name + " | " + "Pop: " + population + " | " + "Area: " + squareMileage + " sq mi");
            }

            System.out.print("\nPlease enter the lower limit for capital city population: ");
            Scanner input = new Scanner(System.in);
            int limit = input.nextInt();
            System.out.println(limit);

            System.out.println("\nLISTING CAPITALS WITH POPULATIONS GREATER THAN :" + limit + "\n");

            for(String s : statesSet){
                Capital capital = statesAndCapitals.get(s);
                String name = capital.getName();
                int population = capital.getPopulation();
                double squareMileage = capital.getSquareMileage();
                
                if(capital.getPopulation() > limit){
                    System.out.println(s + " - " + name + " | " + "Pop: " + population + " | " + "Area: " + squareMileage + " sq mi");
                }
            }

            System.out.println("\nPlease enter the upper limit for capital city sq mileage: ");
            limit = input.nextInt();

            System.out.println("\nLISTING CAPITALS WITH AREAS LESS THAN : " + limit + "\n");
            for(String s : statesSet){
                Capital capital = statesAndCapitals.get(s);
                String name = capital.getName();
                int population = capital.getPopulation();
                double squareMileage = capital.getSquareMileage();
                
                if(capital.getSquareMileage() < limit){
                    System.out.println(s + " - " + name + " | " + "Pop: " + population + " | " + "Area: " + squareMileage + " sq mi");
                }
            }
            input.close();
        }
    }
}
