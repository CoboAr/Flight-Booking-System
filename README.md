# Flight Booking System 

A simple model of a flight booking system.

## Requirements

JUnit 4

## What is Flight Booking System?

It is a model that consists of Flight objects (representing flights), passengers (either a frequent flyer member or a non-member) who want to book a flight for a travel. If a seat is available in a given flight, then a ticket will be issued at a price depending on whether the ticket is for a member or a non-member.

## How does it work?

To develop this system, 6 classes are necessary:

<ol>
  <li>Flight class: </li>
  This class has seven instance variables:
  <ul>
    <li>flightNumber of type int</li>
    <li>origin of type String</li>
    <li>destination of type String</li>
    <li>departureTime of type String</li>
    <li>capacity of type int</li>
    <li>numberOfSeatsLeft of type int</li>
    <li>originalPrice of type double</li>
  </ul>
  This class has a constructor that initializes the instance variables. It takes six parameters. If the specified origin and destination are the same, an IllegalArgumentException should be thrown to abort the construction. The numberOfSeatsLeft variable is initialized depending on the specified capacity.
  <img width="1396" alt="Screenshot 2024-01-16 at 5 04 36 PM" src="https://github.com/CoboAr/Flight-Booking-System/assets/144629565/4133b8af-e0f4-4d8b-86bc-fa7c10101407">

  <li>Ticket class:</li>
This class represents a flight ticket. It has four instance variables:
<ul>
  <li>passenger of type Passenger</li>
  <li>flight of type Flight</li>
  <li>price of type double</li>
  <li>number of type int. Each ticket has a unique ticket number (the first Ticket has ticket number 1, the second has ticket number 2, etc.</li>
</ul>
This clas has: 
<ul>
  <li> A constructor that takes three parameters: Passanger p, Flight flight, double price. It should initialize all the instance variables accordingly.</li>
  <li>Getters and setters for each instance variable.</li>
  <li>override the toString() method that returns a String representation of a Ticket object. The String should include the passenger's name, information about the flight (e.g. the flight number, the origin, the destination, the departure, and the original price) and the actual price.</li>

</ul>
<li>Passenger class:</li>
This is an abstract class. The subclasses of this class are: Member and NonMember. The class has attributes common to all kind of passengers. It contains two instance variables: 
<ul>
  <li>name of type String</li>
  <li>age of type int</li>
</ul>
This class should have a constructor for initializing the instance variables, getters, setters for each instance variable. This class has also an abstract method double applyDiscount (double p). This method is overriden by both the subclasses. In the subclasses, this applyDiscount method should return a price after applying the appropriate discount.
<li>Member class: A Member object represents a frequent flyer member. This class has one instance variable: </li>
<ul>
  <li>yearsOfMembership of type int</li>
</ul>
This class extends the Passenger class and overrides the applyDiscount (double p) method as follows. If the member has membership for more than 5 years, then 50% discount will be applied. If the member has membership for more than 1 year but less than or equal to 5 years, then 10% discount will be applied. otherwise no discount.

<li>NonMember class: A NonMember object represents a passenger who is not a frequent flyer member. This class has no instance variables.     
This class extends the Passenger class and overrides the applyDiscount (double p) method as follows. If the age of the person is more than 65, 10% discount will be applied. Otherwise, no discount.</li>

<li>Manager class: A Manager object manages the flights of a specific arilines. It maintains an array of flights and an array of issued tickets. It has the following methods: </li>
<ul>
  <li>public void createFlights(): this method populates the array of flights, and asks the user to input information about the flights.</li>
  <li>public void displayAvailableFlights(String origin, String destination): this method should display all the available flights from origin to destination. It displays only those flights that are not yet fully booked. </li>
  <li>public Flight getFlight (int flightNumber): this method should return the Flight object for the specified flight number.</li>
  <li>public void bookSeat(int flightNumber, Passenger p): This method first tries to find a flight for the given flight number. If such flight exists, then it tries to book a seat in that flight. If booking is successful, then applies the appropriate discount on the price depending on the passenger being a member or a non-member (Polymorphism works here). Finally, it issues a ticket with the appropriate price.</li>
  <li>public static void main (String[] args): this method calls the other methods of the Manager class to see if they work. </li>
</ul>
</ol>

FlightTest it is a class created to test Flight class with JUnits tests.   
<img width="1380" alt="Screenshot 2024-01-17 at 12 45 00 AM" src="https://github.com/CoboAr/Flight-Booking-System/assets/144629565/dae67442-c055-48aa-9a39-d176e953d4bd">

## Demo

https://github.com/CoboAr/Flight-Booking-System/assets/144629565/eedcb9df-1714-496c-bad9-f3b78abeb002

<img width="1420" alt="Screenshot 2024-01-17 at 12 55 08 AM" src="https://github.com/CoboAr/Flight-Booking-System/assets/144629565/22efc089-7631-4178-a2f8-7167bf71b122">
<img width="1440" alt="Screenshot 2024-01-17 at 12 56 33 AM" src="https://github.com/CoboAr/Flight-Booking-System/assets/144629565/0c2c7614-dc86-4a77-a643-1870d235c5e7">
<img width="1439" alt="Screenshot 2024-01-17 at 12 57 56 AM" src="https://github.com/CoboAr/Flight-Booking-System/assets/144629565/eadb136b-a3da-40d6-ab61-ffc77cfff6fb">
<img width="1437" alt="Screenshot 2024-01-17 at 12 58 54 AM" src="https://github.com/CoboAr/Flight-Booking-System/assets/144629565/3cb63e91-41b4-4f35-99d6-59c5086dbba2">


Enjoy! And please do let me know if you have any comments, constructive criticism, and/or bug reports.
## Author
## Arnold Cobo







