package demo;

import java.sql.*;

public class demo {

    private static final String url = "jdbc:postgresql://localhost:5432/college";
    private static final String user = "postgres";
    private static final String password = "123";


    public static void main(String[] args) {

        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver Loaded...");


            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Established...");
            connection.setAutoCommit(false);

            String sql1 = "insert into passenger values (104, 'Chinmaya Dash', 23, '6:30', '8:30')";
            Statement statement = connection.createStatement();
            statement.execute(sql1);

            String sql2 = "insert into flight values (7438, 'AIR-INDIA', 'BLR', 'BBSR', '6:30AM IST', '8:30 AM IST')";
            statement.execute(sql2);
            Savepoint savepoint = connection.setSavepoint();

            String sql3 = "insert into payment values (4446, 'Chinmaya Dash', 44321)";
            statement.execute(sql3);



            if (payment.isSucessful()){
                connection.commit();
                System.out.println("pument successful");
            }else{
                if (connection != null){
                    connection.rollback(savepoint);
                    connection.commit();
                    System.out.println("payment Successfull not saved");
                }
                System.out.println("Payment Failed...");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
