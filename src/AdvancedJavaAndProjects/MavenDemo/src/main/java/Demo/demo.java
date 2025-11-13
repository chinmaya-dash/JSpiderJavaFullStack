package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class demo {
    private static String url = "jdbc:postgresql://localhost:5432/college";
    private static String user = "postgres";
    private static String password = "123";
    public static void main(String[] args) {

        try {
//            step 1 - Loading and Resistering
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver Loaded");

//            step 2 - Establishing Connection
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Established");

//            step 3 - creating statement
            Statement statement = connection.createStatement();

            String sql = "insert into student values(111, 'Chinmaya Dash', 24)";
//            String sql2 = "delete from lectures where Name = 'deepak'";
            String sql2 = "update student set id = 100, name = 'chinu', age = 25 where name = 'Chinmaya Dash'";

//            step 4 - executing query
            boolean flag = statement.execute(sql2);
            System.out.println("Data Saved...");
            System.out.println(flag);

//            step 5 - closing connection
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
