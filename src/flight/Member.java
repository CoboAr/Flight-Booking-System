package flight;

/**
 *
 * @author acobo
 */

// Class Member is a subclass of Passenger and has 1 instance variable
public class Member extends Passenger {

    private int yearsOfMembership;

    //Constructor takes 3 parameters, call the super constructor
    //and initialize it's own instance variable
    public Member (int yearsofmembership, String name, int age){

        super(name,age);
        this.yearsOfMembership = yearsofmembership;
    }

    //Overriding method applyDiscount from parent class
    @Override
    public double applyDiscount(double p){
        if (yearsOfMembership > 5){
            p = p/2;
            return p;
        }

        else if (yearsOfMembership < 5 && yearsOfMembership > 1){

            double p1 = (p*10)/100;
            p = p - p1;
            return p;
        }else{
            return p;
        }
    }

}