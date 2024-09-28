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
        fuelType = e.getFuelType();
        fuelCapacity = e.getmaxFuelLevel();
        this.nCars = nCars;
        this.passengerCapacity = passengerCapacity;
        e = new Engine(fuelType, fuelCapacity);
        ArrayList<Car> cars = new ArrayList<Car>();
        for(int i = 0; i<=nCars;i++){
            c = new Car(c.getPassengersOnboard(), c.getCapacity());
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
        passengerCapacity = 0;
        for(int i = 0; i<cars.size();i++){
            passengerCapacity += cars.get(i).getCapacity();
        }
        return passengerCapacity;
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
}
