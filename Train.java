import java.util.ArrayList;

public class Train {
    //Attributes
    private FuelType fuelType;
    private double fuelCapacity;
    private int nCars;
    private int passengerCapacity;
    private ArrayList<Car> cars;
    private Engine e;
    //Train constructor
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.fuelType = fuelType;
        this.fuelCapacity = fuelCapacity;
        this.nCars = nCars;
        this.passengerCapacity = passengerCapacity;
        e = new Engine(fuelType, fuelCapacity);
        this.cars = new ArrayList<Car>();
        for(int i = 0; i<nCars;i++){
            Car c = new Car(passengerCapacity);
            this.cars.add(c);
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
            maxCapacity += passengerCapacity;
        }
        return maxCapacity;
    }

     //Accessor to get number of open seats across all cars
     public int seatsRemaining(){
        int seatsRemaining = 0;
        for(int i = 0; i<nCars;i++){
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
        for(int i = 0; i<nCars;i++){
            cars.get(i).printManifest();
        }
    }
    public static void main(String[] args) {
        Train t = new Train(FuelType.ELECTRIC,100.0,3,10 );
        Passenger p = new Passenger("Melissa");
        Passenger p2 = new Passenger("Jordan");
        t.getCar(0).addPassenger(p);
        t.getCar(0).addPassenger(p2);
        t.getCar(0).printManifest();
        System.out.println(t.getMaxCapacity());
        System.out.println(t.getCar(0).getCapacity());
        System.out.println(t.getNumberOfCars());
        System.out.println(t.seatsRemaining());
        t.printManifest();
    }
}
