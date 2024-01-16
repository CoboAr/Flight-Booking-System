package flight;

/**
 *
 * @author acobo
 */

//Abstract class Passenger with 2 instance variables
public abstract class Passenger {

    protected String name;
    protected int age;

    //Constructor that takes 2 parameters and initializes the instance variables
    public Passenger (String name, int age){
        this.name = name;
        this.age = age;
    }

    //getters and setters of instance variables
    public String getname (){
        return name;
    }

    public void setname(String name){
        this.name = name;
    }

    public int getage(){
        return age;
    }

    public void setage(int age){
        this.age = age;
    }

    // Abstract method that will be Overriden by both subclasses
    public abstract double applyDiscount (double p);
}

