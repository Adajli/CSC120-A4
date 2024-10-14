/* Passenger function shows actions and attributes of the passenger. */
public class Passenger {
    //Attribute
    private String name;
    /**
     * Constructor for passenger
     * @param name
     */
    public Passenger(String name) {
        this.name = name;
    }
    /** Method gets information about passenger.
     * @return String
    */
    public String getPassenger(){
        return this.name;
    }
    /** boardCar function allows passenger to board car
     * @param c
     * @retuurn void
    */
    public void boardCar(Car c){
        try {
            c.addPassenger(this);
            if(c.addPassenger(this)){
                System.out.println(getPassenger()+ " already boarded.");
            }
        } catch (Exception e) {
            System.out.println("The car is already full.");
        }
       
    }
    /** Function lets passenger get off the car.
     * @param c
     * @return void
    */
    public void getOffCar(Car c){
        try {
            c.addPassenger(this);
            if(c.removePassenger(this)){
                System.out.println( getPassenger()+ " is off the train.");
            }
        } catch (Exception e) {
            System.out.println( getPassenger() +" is not on board.");
        } 
    }
    
    
    /*Main function used for testing*/
    public static void main(String[] args) {
        Passenger p = new Passenger("Melissa");
        System.out.println(p.getPassenger());
        Car c = new Car(10);
        p.boardCar(c);
        p.getOffCar(c);
        Passenger p2 = new Passenger("Jordan");
        p2.boardCar(c);

    }
}
