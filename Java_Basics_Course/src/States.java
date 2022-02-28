import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class States {
    public static void main(String[] args) {
        Map<String, String> statesAndCapitals = new HashMap<>();
        statesAndCapitals.put("Alabama",	"Montgomery");
        statesAndCapitals.put("Alaska", "Juneau");
        statesAndCapitals.put("Arizona", "Phoenix");
        statesAndCapitals.put("Arkansas", "Little Rock");

        System.out.println("STATES:");
        System.out.println("=======");

        Set<String> states = statesAndCapitals.keySet();

        for(String s : states){
            System.out.println(s);
        }

        System.out.println("\nCAPITALS:");
        System.out.println("=========");

        for(String s: states){
            System.out.println(statesAndCapitals.get(s));
        }

        System.out.println("\nSTATE/CAPITAL PAIRS:");
        System.out.println("====================");

        for(String s: states){
            System.out.println(s + " - " + statesAndCapitals.get(s));
        }

    }
}
