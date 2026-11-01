import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReservationExist {
    static boolean reservationExists(Connection connection, int reservationId){

        try{
            String sql = "SELECT * FROM reservations WHERE reservation_id = " + reservationId;

            try(Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)){

                return resultSet.next();
            }
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
}
