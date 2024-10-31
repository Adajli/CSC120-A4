import java.util.ArrayList;

public class Train {
    // Attributes
    private FuelType fuelType;
    private double fuelCapacity;
    private int nCars;
    private int passengerCapacity;
    private ArrayList<Car> cars;
    private final Engine e;
    {
        e = new Engine(fuelType, fuelCapacity);
    }

    /**
     * rain constructor
     * 
     * @param nCars
     * @param passengerCapacity
     */
    public Train(int nCars, int passengerCapacity) {
        this.nCars = nCars;
        this.passengerCapacity = passengerCapacity;
        this.cars = new ArrayList<Car>();
        for (int i = 0; i < nCars; i++) {
            Car c = new Car(passengerCapacity);
            this.cars.add(c);
        }
    }

    /**
     * Engine accessor
     * 
     * @return e
     */
    public Engine getEngine() {
        return e;
    }

    /**
     * Fuel type accessor
     * 
     * @return fuelType
     */
    public FuelType getFuelType() {
        return fuelType;
    }

    // Accessor to get fuel capacity
    public double getFuelCapacity() {
        return fuelCapacity;
    }

    // Accessor to get passenger capacity
    public double getPassengerCapacity() {
        return passengerCapacity;
    }

    // Accessor to get the number of cars
    public int getNumberOfCars() {
        return nCars;
    }

    /**
     * Accessor for maximum capacity
     * 
     * @return maxCapacity
     */
    public int getMaxCapacity() {
        int maxCapacity = 0;
        for (int i = 0; i < cars.size(); i++) {
            maxCapacity += passengerCapacity;
        }
        return maxCapacity;
    }

    /**
     * Accessor for remaining seats
     * 
     * @return seatsRemaining
     */
    public int seatsRemaining() {
        int seatsRemaining = 0;
        for (int i = 0; i < nCars; i++) {
            seatsRemaining += cars.get(i).seatsRemaining();
        }
        return seatsRemaining;
    }

    // Accesor to get a car of the train
    public Car getCar(int i) {
        return cars.get(i);
    }

    // Manifest function
    public void printManifest() {
        for (int i = 0; i < nCars; i++) {
            System.out.println("Car " + (i + 1));
            cars.get(i).printManifest();
        }
    }

    public static void main(String[] args) {
        Train t = new Train(3, 10);
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
