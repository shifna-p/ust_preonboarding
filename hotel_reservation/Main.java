import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter guest name: ");
            String guestName = scanner.nextLine();

            System.out.print("Enter check-in date (yyyy-MM-dd): ");
            String checkInDate = scanner.nextLine();

            System.out.print("Enter room type (single, double, suite): ");
            String roomType = scanner.nextLine();

            Reservation reservation = new Reservation(guestName, checkInDate, roomType);
            System.out.println("Reservation successful: " + reservation);

        } catch (PastDateException | InvalidRoomTypeException | ParseException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
