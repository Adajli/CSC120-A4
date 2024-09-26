public class Engine {
   //Attributes
   private FuelType f;
   private double currentFuelLevel;
   private double maxFuelLevel;

   //Constructor
   public Engine(FuelType f, double maxFuelLevel){
    this.f = f;
    this.maxFuelLevel = maxFuelLevel; 
    this.currentFuelLevel = maxFuelLevel;
   }

   //Max fuel level accessor
   public double getmaxFuelLevel(){
    return this.maxFuelLevel;
   }
   //Current fuel level accessor
   public double getcurrentFuelLevel(){
    return this.currentFuelLevel;
   }
   //Fuel type accessor
   public FuelType getFuelType(){
    return this.f;
   }
   // Refuel method to refuel engine
   public void refuel(){
    this.currentFuelLevel = maxFuelLevel;
   }
   //Go function 
   public boolean go(){
    this.currentFuelLevel -= 1.0;
    System.out.println(currentFuelLevel);
    if(currentFuelLevel>0.0){
        return true;
    }else{
        return false;
    }
    
   }

   //main function
   public static void main(String[] args) {
    Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
    System.out.println(myEngine.getmaxFuelLevel());
    myEngine.go();
    System.out.println(myEngine.getcurrentFuelLevel());
    while (myEngine.go()) {
       System.out.println("Choo choo!");
    }
    System.out.println("Out of fuel.");
   }
}