import java.util.ArrayList;

public class Flight {

    public String getFlightNumber;
    private PlaneType planeType;
    private String flightNumber;
    private String destination;
    private String departAirport;
    private String departureTime;
    private ArrayList<Passenger> passengers;


    public Flight(PlaneType planeType, String flightNumber, String destination, String departure, String departureTime) {
        this.planeType = planeType;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departAirport = departure;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<Passenger>();
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public int getAvailableSeats() {
        if (this.planeType.getCapacity() > passengers.size()) {
       return this.planeType.getCapacity() - passengers.size();
        } else {
            return 0;
        }


}

    public void addCustomer(Passenger passenger) {
            getAvailableSeats();
            this.passengers.add(passenger);

    }
}