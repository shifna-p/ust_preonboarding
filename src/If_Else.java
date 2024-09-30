//Introducing IF ELSE statement

public class If_Else {
    public static void main(String[] args) {
        int seat = 4;
        int req_seat = 3;
        if ( ( req_seat==seat) || (req_seat < seat)){
            System.out.println("Booking accepted");
        }else {
            System.out.println("Booking rejected");
        }

    }
}
