public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }
    //boardCar function
    public void boardCar(Car c){
        c.addPassenger(this);
        if(c.addPassenger(this)){
            System.out.println("The passenrger" + name +" already boarded");
        }else{
            System.out.println("The car is already full");
        }
    }
    public void getoff(Car c){
        c.addPassenger(this);
        if(c.addPassenger(this)){
            System.out.println("The passenrger" + name +" already boarded");
        }else{
            System.out.println("The car is already full");
        }
    }
    

}
