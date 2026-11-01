import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateReservation {
    static void updateReservation(Connection connection, Scanner scanner){

        try{
            System.out.println("Enter reservationId to update: ");
            int reservationId = scanner.nextInt();
            scanner.nextLine();

            if (!ReservationExist.reservationExists(connection, reservationId)) {
                System.out.println("Reservation not found for the given ID.");
                return;
            }

            System.out.print("Enter new guest name: ");
            String newGuestName = scanner.nextLine();
            System.out.print("Enter new room number: ");
            int newRoomNumber = scanner.nextInt();
            System.out.print("Enter new contact number: ");
            String newContactNumber = scanner.next();

            String sql = "UPDATE reservations SET guest_name = '" + newGuestName + "', " +
                    "room_no = " + newRoomNumber + ", " +
                    "contact_no = '" + newContactNumber + "' " +
                    "WHERE reservation_id = " + reservationId;

            try(Statement statement = connection.createStatement()){;
                int affectedRows = statement.executeUpdate(sql);

                if (affectedRows > 0) {
                    System.out.println("Reservation updated successfully!");
                } else {
                    System.out.println("Reservation update failed.");
                }
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
