public class Engine {
   //Attributes
   FuelType f;
   private double currentFuelLevel;
   private double maxFuelLevel;

   //Constructor
   public Engine(FuelType fuelType, double maxFuelLevel){
    f = fuelType;
    this.maxFuelLevel = maxFuelLevel; 
   }

   //Max fuel level accessor
   public double getmaxFuelLevel(){
    return maxFuelLevel;
   }
   //Current fuel level accessor
   public double getcurrentFuelLevel(){
    return currentFuelLevel;
   }
   //Fuel type accessor
   public FuelType getFuelType(){
    return f;
   }
   // Refuel method to refuel engine
   public void refuel(){
    currentFuelLevel = maxFuelLevel;
   }
   //Go function 
   public boolean go(){
    if(currentFuelLevel>0.0){
        System.out.println(currentFuelLevel);
        currentFuelLevel -= 1.0;
        return true;
    }else{
        return false;
    }

   }

   //main function
   public static void main(String[] args) {
    Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
    myEngine.go();
    myEngine.getcurrentFuelLevel();
    // while (myEngine.go()) {
    //     System.out.println("Choo choo!");
    // }
    // System.out.println("Out of fuel.");
   }
}