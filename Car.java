import java.util.ArrayList;

public class Car {
    // Attributes of car
    private ArrayList<Passenger> passengersOnboard;
    private int maxCapacity;

    /**
     * Constructor for Car
     * 
     * @param maxCapacity
     */
    public Car(int maxCapacity) {
        this.passengersOnboard = new ArrayList<Passenger>(maxCapacity);
        this.maxCapacity = maxCapacity;
    }

    /**
     * Method acesses maximum capacity of the car
     * 
     * @return maxCapacity
     */
    public int getCapacity() {
        return this.maxCapacity;
    }

    /**
     * Method acesses array of passengers onboard
     * 
     * @return passengersOnboard
     */
    public ArrayList<Passenger> getPassengersOnboard() {
        return this.passengersOnboard;
    }

    /**
     * Method returns seats remaining in the car
     * 
     * @return seats left
     */
    public int seatsRemaining() {
        return maxCapacity - passengersOnboard.size();
    }

    /**
     * Method to add a passenger
     * 
     * @param p
     * @return added
     */
    public boolean addPassenger(Passenger p) {
        boolean added = false;
        if (passengersOnboard.size() < maxCapacity && !p.equals(null) || !p.equals(p)) {
            passengersOnboard.add(p);
            added = true;
        } else {
            throw new RuntimeException("Can't add the passenger to the car of the train.");
        }
        return added;
    }

    /**
     * Method to remove the passenger
     * 
     * @param p
     * @return removed
     */
    public boolean removePassenger(Passenger p) {
        boolean removed = false;
        if (passengersOnboard.contains(p)) {
            passengersOnboard.remove(p);
            removed = true;
        } else {
            throw new RuntimeException("Can't remove passenger from train.");
        }
        return removed;
    }

    /**
     * Manifest function prints out information
     * 
     * @return void
     */
    public void printManifest() {
        if (passengersOnboard.size() == 0) {
            System.out.println("This car is empty.");
        } else {
            for (int i = 0; i < passengersOnboard.size(); i++) {
                System.out.println(passengersOnboard.get(i).getPassenger());
            }
        }
    }

    // Main function used for testing
    public static void main(String[] args) {
        Car c = new Car(10);
        Passenger p = new Passenger("Melissa");
        Passenger p2 = new Passenger("Jordan");
        System.out.println(p.getPassenger());
        c.addPassenger(p);
        c.addPassenger(p2);
        c.removePassenger(p2);
        c.printManifest();
    }
}