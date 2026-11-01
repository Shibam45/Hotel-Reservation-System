import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ReserveRoom {
    static void reserveRoom(Connection connection, Scanner scanner){

        try{
            System.out.println("Enter guest name: ");
            scanner.nextLine();
            String guestName = scanner.nextLine();
            System.out.println("Enter room number: ");
            int roomNumber = scanner.nextInt();
            System.out.println("Enter contact number: ");
            String contactNumber = scanner.next();

            String sql = "INSERT INTO reservations(guest_name, room_no, contact_no)"+
                    "VALUES('" + guestName + "', " + roomNumber + ", '" + contactNumber + "')";

            try (Statement statement = connection.createStatement()){
                int affectrows  = statement.executeUpdate(sql);

                if(affectrows > 0){
                    System.out.println("Reservation Successful");
                }else{
                    System.out.println("Reservation Failed");
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
