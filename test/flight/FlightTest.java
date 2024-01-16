package flight;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author acobo
 */
public class FlightTest {

    public FlightTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //Testing constructor with valid arguments
    @Test
    public void testConstructor(){
        System.out.println("Constructor");
        Flight instance = new Flight(111, "Toronto", "Kolkata",
                "03/02/99 7:50 pm", 450, 1000.0);

        assertEquals(111,instance.getflightNumber());
        assertEquals("Toronto",instance.getorigin());
        assertEquals("Kolkata", instance.getdestination());
        assertEquals("03/02/99 7:50 pm",instance.getdepartureTime());
        assertEquals(450, instance.getcapacity());
        assertEquals(450, instance.getnumberOfSeatsLeft());
        assertEquals(1000.0,instance.getoriginalPrice(),0.0);
    }

    //Testing constructor with an invalid argument
    @Test (expected=IllegalArgumentException.class)
    public void testInvalidConstructor(){
        System.out.println("Constructor Fail");
        Flight instance = new Flight(103, "Toronto", "Toronto",
                "03/02/99 7:50 pm", 450, 1000.0);
    }


    //Testing setters and getters methods
    @Test
    public void testSettersAndGetters(){
        System.out.println("testSettersAndGetters");
        Flight instance = new Flight(1111, "Toronto", "Kolkata",
                "03/02/99 7:50 pm", 450, 1000.0);

        instance.setflightNumber(11);
        instance.setorigin("Winnipeg");
        instance.setdestination("Tirana");
        instance.setdepartureTime("01/05/2023 16:00");
        instance.setcapacity(100);
        instance.setoriginalPrice(2200.0);
        instance.setnumberOfSeatsLeft(53);

        assertEquals(11, instance.getflightNumber());
        assertEquals("Winnipeg", instance.getorigin());
        assertEquals("Tirana", instance.getdestination());
        assertEquals("01/05/2023 16:00", instance.getdepartureTime());
        assertEquals(100, instance.getcapacity());
        assertEquals(2200.0, instance.getoriginalPrice(), 0.01);
        assertEquals(53, instance.getnumberOfSeatsLeft());
    }

    //Testing bookASeat() method
    @Test
    public void testBookASeat(){
        System.out.println("testBookASeat");
        Flight instance = new Flight(103, "Toronto", "Kolkata",
                "03/02/99 7:50 pm", 450, 1000.0);
        assertTrue(instance.bookASeat());
    }

    //Testing toString() method
    @Test
    public void testToString(){
        System.out.println("toString");
        Flight instance = new Flight(111, "Toronto", "Kolkata",
                "03/02/99 7:50 pm", 450, 1000.0);
        String expResult = "Flight 111, Toronto to Kolkata, 03/02/99 7:50 pm, original price: 1000.0$";
        assertEquals(expResult, instance.toString());
    }
}
