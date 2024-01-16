package flight ;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author acobo
 */

//class Manager which has the main method and it is going to test
//the functionality of this project.
public class Manager {
    private ArrayList<Flight> arrayOfFlights;
    private static ArrayList<Ticket> arrayOfTickets;

    // constructor of class Manager
    public Manager (){

        this.arrayOfFlights = new ArrayList<Flight>();
        this.arrayOfTickets = new ArrayList<Ticket>();
    }

    //create flights method
    public void createFlights(){

        int flightNumber;
        String origin;
        String destination;
        String departureTime;
        int capacity;
        int numberOfSeatsLeft;
        double originalPrice;

        Scanner item1 = new Scanner(System.in);
        System.out.println("Enter flight number: ");
        flightNumber = item1.nextInt();

        Scanner item2 = new Scanner(System.in);
        System.out.println("Enter origin: ");
        origin = item2.nextLine();

        Scanner item3 = new Scanner(System.in);
        System.out.println("Enter destination: ");
        destination = item3.nextLine();

        Scanner item4 = new Scanner(System.in);
        System.out.println("Enter departure time(dd/mm/yy 7:50 pm): ");
        departureTime = item4.nextLine();

        Scanner item5 = new Scanner(System.in);
        System.out.println("Enter capacity: ");
        capacity = item5.nextInt();

        Scanner item6 = new Scanner(System.in);
        System.out.println("Enter number of seats: ");
        numberOfSeatsLeft = item6.nextInt();

        Scanner item7 = new Scanner(System.in);
        System.out.println("Enter original price: ");
        originalPrice = item7.nextDouble();

        Flight f1 = new Flight(flightNumber, origin, destination, departureTime, capacity, originalPrice);
        arrayOfFlights.add(f1);
        System.out.println(f1);
    }

    //displayAvailableflights method
    public void displayAvailableFlights(String origin, String destination){
        Boolean game_is_on = true;

        System.out.println("List of Available flights: ");
        for (Flight f : arrayOfFlights){
            if(f.getorigin().equals(origin)&&f.getdestination().equals(destination)){
                if(f.getnumberOfSeatsLeft()>0){
                    System.out.println(f);
                    game_is_on = false;
                }else{
                    System.out.println("This flight is fully booked!");
                }

            }
        }
        if (game_is_on == true){
            System.out.println("No avaible flights into this date!\n");
        }
    }

    //getFlight() method
    public Flight getFlight(int flightNumber){

        for (Flight f1: arrayOfFlights){

            if (f1.getflightNumber()==flightNumber){
                return f1;
            }
        }
        System.out.println("This flight number is not in the database!");
        return null;
    }

    //bookSeat() method
    public void bookSeat (int flightNumber, Passenger P){

        for (Flight f1: arrayOfFlights){

            if (f1.getflightNumber()==flightNumber){
                if (f1.getnumberOfSeatsLeft()>0){
                    if(f1.bookASeat()==true){
                        double price = P.applyDiscount(f1.getoriginalPrice());
                        Ticket ticket = new Ticket(P,f1,price);
                        arrayOfTickets.add(ticket);
                        System.out.println("Seat booked successfully!");
                        System.out.println(ticket);
                    }else{
                        System.out.println("No seats available!");
                    }


                }
            }else{
                //System.out.println("The flight does not exist!");
            }
        }

    }

    //main() method.
    public static void main(String[] args){

        Manager manager = new Manager();
        Flight flight;
        Passenger passenger;
        int flightnumber;
        Scanner scan = new Scanner(System.in);

        //testing createFlights() method
        System.out.println("Testing the creatFlights() methpod \n");
        System.out.println("Create 3 flights. Use Toronto - Paris, flight number: 34 in one of them.");
        System.out.println("The flights will be added into the arrayOfFlights automatically.");
        manager.createFlights();
        manager.createFlights();
        manager.createFlights();
        // test displayAvailableFlights() method
        System.out.println("\n Testing the displayAvailableFlights() method.\n");
        System.out.println("The flights available from Paris to Toronto:");
        manager.displayAvailableFlights("Toronto", "Paris");

        //Retrieving information about a flight
        System.out.println("\n Testing the getFlight() method\n");
        System.out.println("Enter 34 to retrieve information about flight number 34.");
        flightnumber = scan.nextInt();
        flight = manager.getFlight(flightnumber);
        if (flight == null){
            System.out.println("The flight information regarding the flight number you inserted does not exist.");

        }else{
            System.out.println(flight);
        }

        //booking a seat for a member with more than 5 years of membership
        System.out.println("\n Testing the bookSeat() method.");
        System.out.println("Booking a seat for a member with 10 years of membership, 50% discount applied.");
        Passenger passengerMember1 = new Member(10,"Ryerson",100);
        manager.bookSeat(flightnumber=34, passenger=passengerMember1);

        //booking a seat for a member with 3 years of membership
        System.out.println("\n Booking a seat for a member with 3 years of membership, 10% discount applied.");
        Passenger passengerMember2 = new Member(3,"Ben",55);
        manager.bookSeat(flightnumber=34, passenger=passengerMember2);


        //booking a seat for a nonmember older than 65 years old, 10% discount applied.
        System.out.println("\n Booking a seat for a non member passenger older than 65 years old. 10% discount applied.");
        Passenger passengerNonMember1 = new NonMember("Ford",100);
        manager.bookSeat(flightnumber=34, passenger=passengerNonMember1);

        //booking a seat for a nonmember younger than 65 years old.
        System.out.println("\n Booking a seat for a non member passenger younger than 65 years old. No discount applied.");
        Passenger passengerNonMember2 = new NonMember("Trudeau",51);
        manager.bookSeat(flightnumber=34, passenger=passengerNonMember2);

        System.out.println("End of program.");

    }
}
