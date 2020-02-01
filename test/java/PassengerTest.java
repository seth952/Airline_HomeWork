import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before

    public void before(){
        passenger = new Passenger("Teddy Templeton", 2);
    }

    @Test

    public void hasName(){
        assertEquals("Teddy Templeton", passenger.getName());
    }

    @Test
    public void hasBags(){
        assertEquals(2, passenger.getBags());
    }
}
