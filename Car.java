import java.util.ArrayList;
public class Car {
    //Attributes of car
    private ArrayList<Passenger> passengersOnboard;
    private int maxCapacity;

    //Constructor
    public Car(int maxCapacity){
        this.passengersOnboard = new ArrayList<Passenger>(maxCapacity);
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
            System.out.println("This car is empty.");
        }else{
            for(int i = 0; i<passengersOnboard.size(); i++){
                System.out.println(passengersOnboard.get(i).getPassenger());           
            }
        }
    }
    
    //Main function for testing
    public static void main(String[] args) {
        Car c = new Car(10);
        Passenger p = new Passenger("Melissa");
        System.out.println(p.getPassenger());
        c.addPassenger(p);
        c.printManifest();
    }
}