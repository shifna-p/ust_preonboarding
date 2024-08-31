public class Main {
    public static void main(String[] args) {
        FlightBookingSystem bookingSystem = new FlightBookingSystem();

        try {
            // Valid booking
            bookingSystem.bookTickets("FL123", 3, "John Doe");
            
            // Attempt to book more than the allowed limit
            bookingSystem.bookTickets("FL123", 6, "Alice Smith");
            
        } catch (TicketLimitExceededException | InvalidFlightNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Attempt to book with an invalid flight number
            bookingSystem.bookTickets("FL999", 2, "Bob Johnson");
            
        } catch (TicketLimitExceededException | InvalidFlightNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
