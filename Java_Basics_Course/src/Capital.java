public  class Capital{
    String name;
    int population;
    double squareMileage;

    Capital(){
        this.name = "";
        this.population = 0;
        this.squareMileage = 0;
    }
    Capital(String name, int population, int squareMileage){
        this.name = name;
        this.population = population;
        this.squareMileage = squareMileage;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setPopulation(int population){
        this.population = population;
    }
    public void setSquareMileage(double sqaureMileage){
        this.squareMileage = sqaureMileage;
    }
    public String getName(){
        return name;
    }
    public int getPopulation(){
        return population;
    }
    public double getSquareMileage(){
        return squareMileage;
    }
    
}