import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Plane plane;
    private Flight flight;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;
    private Passenger passenger5;




    @Before

    public void before(){

        flight = new Flight(PlaneType.BOEING747, "FK218", "GLA", "LON", "12.00");
        passenger1 = new Passenger("Jeff", 4);
        passenger2 = new Passenger("Tom", 1);
        passenger3 = new Passenger("Ted", 2);
        passenger4 = new Passenger("June", 2);
        passenger5 = new Passenger("Sam", 3);

    }

    @Test

    public void hasPlaneType(){
        assertEquals(PlaneType.BOEING747, flight.getPlaneType());

    }

    @Test
    public void hasFlightNumber(){
        assertEquals("FK218", flight.getFlightNumber());
    }

    @Test
    public void checkAvailableSeats(){
    assertEquals(4, flight.getAvailableSeats());
    }

    @Test
    public void canAddCustomer(){
        flight.addCustomer(passenger1);
        assertEquals(3, flight.getAvailableSeats());
    }
    @Test
    public void canNotAddCustomer(){
        flight.addCustomer(passenger1);
        flight.addCustomer(passenger2);
        flight.addCustomer(passenger3);
        flight.addCustomer(passenger4);
        flight.addCustomer(passenger5);
        assertEquals(0, flight.getAvailableSeats());
    }


}
