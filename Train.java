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
}
