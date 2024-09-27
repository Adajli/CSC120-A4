import java.util.ArrayList;
public class Car {
    //Attributes of car
    private ArrayList<Passenger> passengersOnboard;
    private int maxCapacity;

    //Constructor
    public Car(ArrayList<Passenger> passengersOnboard, int maxCapacity){
        this.passengersOnboard = passengersOnboard;
        this.maxCapacity = maxCapacity;
    }
    //Method returns maximum capacity of the car
    public int getCapacity(){
        return this.maxCapacity;
    }
    //Method returns seats remaining in the car
    public int seatsRemaining(){
        return maxCapacity-passengersOnboard.size();
    }
}