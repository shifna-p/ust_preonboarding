import java.util.HashMap;
import java.util.Map;

class FlightBookingSystem {
    private static final int MAX_TICKETS = 5;
    private static final Map<String, String> availableFlights = new HashMap<>();

    static {
        availableFlights.put("FL123", "New York to Los Angeles");
        availableFlights.put("FL456", "San Francisco to Chicago");
        availableFlights.put("FL789", "Dallas to Miami");
    }

    public void bookTickets(String flightNumber, int numberOfTickets, String customerName) 
            throws TicketLimitExceededException, InvalidFlightNumberException {
        
        if (!availableFlights.containsKey(flightNumber)) {
            throw new InvalidFlightNumberException("Flight number " + flightNumber + " is invalid or does not exist.");
        }

        if (numberOfTickets > MAX_TICKETS) {
            throw new TicketLimitExceededException("Cannot book more than " + MAX_TICKETS + " tickets at a time.");
        }

        System.out.println("Booking " + numberOfTickets + " ticket(s) for " + customerName + " on flight " + flightNumber + ".");
        System.out.println("Flight details: " + availableFlights.get(flightNumber));
    }
}
