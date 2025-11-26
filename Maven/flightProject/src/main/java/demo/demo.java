package demo;

import java.sql.*;

public class demo {

    private static String url = "jdbc:postgresql://localhost:5432/college?user=postgres&password=123";
    private static Connection connection;

    public static void main(String[] args) {

        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver Loaded...");

            connection = DriverManager.getConnection(url);
            System.out.println("Connection Established...");

            connection.setAutoCommit(false);

            Statement statement = connection.createStatement();

            // Insert passenger
            String sql1 = "insert into passenger values (104, 'Chinmaya Dash', 23, '6:30', '8:30')";
            statement.execute(sql1);

            // Insert flight
            String sql2 = "insert into flight values (7438, 'AIR-INDIA', 'BLR', 'BBSR', '6:30AM IST', '8:30 AM IST')";
            statement.execute(sql2);

            // Create savepoint BEFORE payment
            Savepoint savepoint = connection.setSavepoint("PAYMENT_START");

            // Insert payment
            String sql3 = "insert into payment values (4446, 'Chinmaya Dash', 44321)";
            statement.execute(sql3);

            // Simulate payment success/failure
            boolean paymentSuccess = true; // change to false to test rollback

            if (paymentSuccess) {
                connection.commit();
                System.out.println("Payment successful. All data saved!");
            } else {
                connection.rollback(savepoint);
                connection.commit();
                System.out.println("Payment failed. Passenger + Flight saved. Payment rolled back.");
            }

        } catch (Exception e) {
            try {
                if (connection != null) {
                    connection.rollback(); // FULL ROLLBACK on error
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
