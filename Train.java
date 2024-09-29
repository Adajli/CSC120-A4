import java.util.ArrayList;

public class Train {
    //Attributes
    private FuelType fuelType;
    private double fuelCapacity;
    private int nCars;
    private int passengerCapacity;
    private ArrayList<Car>cars;
    private Engine e;
    private Car c;
    //Train constructor
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.fuelType = fuelType;
        this.fuelCapacity = fuelCapacity;
        this.nCars = nCars;
        this.passengerCapacity = passengerCapacity;
        e = new Engine(fuelType, fuelCapacity);
        ArrayList<Car> cars = new ArrayList<Car>();
        for(int i = 0; i<=nCars;i++){
            Car c = new Car(passengerCapacity);
            cars.add(c);
        }
           
    }
    //Accessor for engine
    public Engine getEngine(){
        return e;
    }
    //Accessor to get fuel type
    public FuelType getFuelType(){
        return fuelType;
    }
    
    //Accessor to get fuel capacity
    public double getCapacity(){
        return fuelCapacity;
    }

    //Accessor to get the number of cars
    public int getNumberOfCars(){
        return nCars;
    }

    //Accessor to get maximum capacity across all cars
    public int getMaxCapacity(){
        int maxCapacity = 0;
        for(int i = 0; i<cars.size();i++){
            maxCapacity += cars.get(i).getCapacity();
        }
        return maxCapacity;
    }

     //Accessor to get number of open seats across all cars
     public int seatsRemaining(){
        int seatsRemaining = 0;
        for(int i = 0; i<cars.size();i++){
            seatsRemaining += cars.get(i).seatsRemaining();
        }
        return seatsRemaining;
    }

    //Accesor to get a car of the train
    public Car getCar(int i){
        return cars.get(i);
    }

    //Manifest function
    public void printManifest(){
        for(int i = 0; i<cars.size();i++){
            cars.get(i).printManifest();
        }
    }
    public static void main(String[] args) {
        Passenger p = new Passenger("Melissa");
        p.getPassenger();
        Car c = new Car(10);
        c.addPassenger(p);
        Train t = new Train(FuelType.ELECTRIC,100.0,3,10 );
        c.getCapacity();
        t.getCar(1);
    }
}
