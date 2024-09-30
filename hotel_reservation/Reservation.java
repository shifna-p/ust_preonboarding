import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

class Reservation {
    private String guestName;
    private Date checkInDate;
    private String roomType;

    private static final List<String> validRoomTypes = Arrays.asList("single", "double", "suite");

    public Reservation(String guestName, String checkInDate, String roomType) throws PastDateException, InvalidRoomTypeException, ParseException {
        this.guestName = guestName;
        setCheckInDate(checkInDate);
        setRoomType(roomType);
    }

    public void setCheckInDate(String checkInDate) throws PastDateException, ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(checkInDate);
        Date today = new Date();
        if (date.before(today)) {
            throw new PastDateException("Check-in date cannot be in the past.");
        }
        this.checkInDate = date;
    }

    public void setRoomType(String roomType) throws InvalidRoomTypeException {
        if (!validRoomTypes.contains(roomType.toLowerCase())) {
            throw new InvalidRoomTypeException("Invalid room type selected: " + roomType);
        }
        this.roomType = roomType;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "Reservation for " + guestName + ": Check-in on " + sdf.format(checkInDate) + ", Room Type: " + roomType;
    }
}
