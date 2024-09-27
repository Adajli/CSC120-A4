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

    //Method to add a passenger
    public boolean addPassenger(Passenger p){
        if(passengersOnboard.size()<maxCapacity){
            passengersOnboard.add(p);
            return true;
        }else{
            return false;
        }
    }

    //Method to remove the passenger 
    public boolean removePassenger(Passenger p){
        if(passengersOnboard.size()>0){
            for(int i = 0; i<passengersOnboard.size(); i++){
                if(passengersOnboard.get(i).equals(p)){
                    passengersOnboard.remove(p);
                    return true;
                }else{
                    return false;
                }     
            }
        }else{
            return false;
        }
    }

    public void printManifest(){
        if(passengersOnboard.size()==0){
            System.out.println();
        }else{
            System.out.println(passengersOnboard.toString());
        }
    }
}