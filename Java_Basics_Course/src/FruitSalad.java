public class FruitSalad {
    public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", 
        "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", 
        "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        String[] fruitSalad = new String[50];
        int appleCounter = 0;
        int orangeCounter = 0;
        int total = 0;
        String[] random = new String[50];

        for (int i = 0; i < fruit.length; i++){
            if(fruit[i].contains("berry") && total != 12){
                fruitSalad[i] = fruit[i];
                total++;
            }
            if(fruit[i].contains("Apple") && appleCounter < 3 && total != 12){
                fruitSalad[i] = fruit[i];
                appleCounter++;
                total++;
            }
            
            if(fruit[i].contains("Orange") && orangeCounter < 2 && total != 12){
                fruitSalad[i] = fruit[i];
                orangeCounter++;
                total++;
            }
            if(fruitSalad[i] == null){
                random[i] = fruitSalad[i];
            }
            System.out.println("Total: " + total + " Fruit: " + fruitSalad[i]);
        }
    }
}
