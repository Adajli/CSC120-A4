/* Passenger function shows actions and attributes of the passenger. */
public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }
    /** Method gets information about passenger.*/
    public String getPassenger(){
        return this.name;
    }
    /** boardCar function boards car*/
    public void boardCar(Car c){
        if(c.addPassenger(this)){
            System.out.println(getPassenger()+ " already boarded.");
        }else{
            System.out.println("The car is already full.");
        }
    }
    public void getOff(Car c){
        if(c.addPassenger(this)){
            System.out.println( getPassenger()+ " is off the train.");
        }else{
            System.out.println( getPassenger() +" is not on board.");
        }
    }
    
    
    //Main function for testing
    public static void main(String[] args) {
        Passenger p = new Passenger("Melissa");
        System.out.println(p.getPassenger());
        Car c = new Car(10);
        p.boardCar(c);
        p.getOff(c);
        Passenger p2 = new Passenger("Jordan");
        p2.boardCar(c);

    }
}
