package flight;

/**
 *
 * @author acobo
 */
public class Ticket {

    //declaration of 4 instance variables and 1 static variable
    private Passenger passenger;
    private Flight flight;
    private double price;
    private int number;
    private static int count = 0;

    //Constructor that takes 3 parameters and initializes the instance variables
    public Ticket (Passenger p, Flight flight, double price){

        passenger = p;
        this.flight = flight;
        this.price = price;
        count = count +1;
    }

    //getters and setters of instance variables
    public Passenger getpassenger(){
        return passenger;
    }

    public void setpassenger(Passenger passeng){
        passenger = passeng;
    }

    public Flight getflight(){
        return flight;
    }

    public void setflight(Flight f){
        flight = f;
    }

    public double getprice(){
        return price;
    }

    public void setprice(double pri){
        price = pri;
    }

    public int getnumber(){
        return number;
    }

    public void setnumber(int n){
        number = n;
    }

    public int getcount(){
        return count;
    }

    public void setcount(int c){
        count = c;
    }

    //method toString() overriden
    @Override
    public String toString(){
        return passenger.getname() + ", Flight " + flight.getflightNumber()
                + ", "+ flight.getorigin() + " to " + flight.getdestination()+
                ", " + flight.getdepartureTime() + ", original price: " +
                flight.getoriginalPrice() + "$ ,ticket price: " + price + "$";
    }

}