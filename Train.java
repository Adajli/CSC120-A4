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
            c = new Car(c.getPassengersOnboard(), passengerCapacity);
            cars.add(c);
        }
           
    }
    public Engine getEngine(){
        return e;
    }

    public Car getCar(int i){
        return cars.get(i);
    }
}
