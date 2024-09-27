public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }
    //boardCar function
    public void boardCar(Car c){
        if(c.addPassenger(this)){
            System.out.println("The passenrger already boarded");
        }else{
            System.out.println("The car is already full");
        }
    }
    public void getoff(Car c){
        if(c.addPassenger(this)){
            System.out.println("The passenger is already removed");
        }else{
            System.out.println("The pasenger is not on board");
        }
    }
    

}
