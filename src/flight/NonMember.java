package flight;

/**
 *
 * @author acobo
 */

// Class NonMember is a subclass of Passenger and doesn't have any instance variables
public class NonMember extends Passenger {

    //Constructor takes 2 parameters,and calls the super constructor
    public NonMember (String name, int age){
        super(name,age);
    }

    //Overriding method applyDiscount from parent class
    @Override

    public double applyDiscount(double p){
        if ( age > 65){

            double p1 = (p*10)/100;
            p = p - p1;
            return p;
        }

        return p;
    }

}