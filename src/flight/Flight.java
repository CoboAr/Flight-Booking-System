package flight;

/**
 *
 * @author acobo
 */
// Flight class consists of 7 instance variables, a constructor, and instance methods

public class Flight {

    // declaration of 7 instance variables

    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsLeft;
    private double originalPrice;

    //Constructor takes 6 parameters, initializes the instance variables    
    // and throw an IllegalArgumentException if the origin is the same as destination

    public  Flight(int flightNumber, String origin, String destination,
                   String departureTime, int capacity, double originalPrice){

        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.capacity = capacity;
        // numerOfSeatsLeft is initialized depending on capacity
        this.numberOfSeatsLeft = capacity;
        this.originalPrice = originalPrice;

        if (this.origin.equals (this.destination)==true){

            throw new IllegalArgumentException ("Abort constructor. The origin "
                    + "cannot be the same as the destination.");
        }

    }
    // getters and setters method for each instance variable
    public int getflightNumber(){

        return flightNumber;
    }
    public void setflightNumber(int flightnumb){

        flightNumber = flightnumb;
    }
    public String getorigin(){

        return origin;
    }
    public void setorigin(String o){

        origin = o;
    }
    public String getdestination(){

        return destination;
    }
    public void setdestination(String dest){

        destination = dest;
    }
    public String getdepartureTime(){

        return departureTime;
    }
    public void setdepartureTime(String depTime){

        departureTime = depTime;
    }
    public int getcapacity(){

        return capacity;
    }
    public void setcapacity(int cap){

        capacity = cap;
    }
    public int getnumberOfSeatsLeft(){

        return numberOfSeatsLeft;
    }
    public void setnumberOfSeatsLeft(int nmbst){

        numberOfSeatsLeft = nmbst;
    }
    public double getoriginalPrice(){

        return originalPrice;
    }
    public void setoriginalPrice(double orgPrice){

        originalPrice = orgPrice;
    }

    // bookASeat method: decrement the numberOfSeatsLeft when we book a new seat
    // and return true, otherwise return false.

    public boolean bookASeat(){
        if (numberOfSeatsLeft > 0){
            numberOfSeatsLeft = numberOfSeatsLeft-1;
            return true;
        }
        return false;
    }

    // Overriding the toString method 
    @Override

    public String toString(){

        return "Flight " + getflightNumber() + ", " + getorigin() + " to " +
                getdestination() + ", " + getdepartureTime() + ", original price: " +
                getoriginalPrice() + "$";
    }

}
