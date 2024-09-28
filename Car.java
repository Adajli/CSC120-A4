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
    //Method acesses maximum capacity of the car
    public int getCapacity(){
        return this.maxCapacity;
    }

     //Method acesses array of passengers onboard
     public ArrayList<Passenger>  getPassengersOnboard(){
        return this.passengersOnboard;
    }
    //Method returns seats remaining in the car
    public int seatsRemaining(){
        return maxCapacity-passengersOnboard.size();
    }

    //Method to add a passenger
    public boolean addPassenger(Passenger p){
        if(passengersOnboard.size()<maxCapacity && !p.equals(null)){
            passengersOnboard.add(p);
            return true;
        }else{
            return false;
        }
    }

    //Method to remove the passenger 
    public boolean removePassenger(Passenger p){
        boolean removed = false;
        if(passengersOnboard.size()>0){
            for(int i = 0; i<passengersOnboard.size(); i++){
                if(passengersOnboard.get(i).equals(p)){
                    passengersOnboard.remove(p);
                    removed = true;
                }  
            }
        }
        return removed;
    }
    //Manifest function
    public void printManifest(){
        if(passengersOnboard.size()==0){
            System.out.println();
        }else{
            for(int i = 0; i<passengersOnboard.size(); i++){
                System.out.println(passengersOnboard.get(i).toString());           
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Passenger> car = new ArrayList<Passenger>();
        Car c = new Car(car,10);
        c.getCapacity();
    }
}