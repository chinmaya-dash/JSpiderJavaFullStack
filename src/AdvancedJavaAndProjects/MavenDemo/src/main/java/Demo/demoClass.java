package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class demoClass {
    private static String url = "jdbc:postgresql://localhost:5432/college";
    private static String user = "postgres";
    private static String password = "123";
    public static void main(String[] args){
//1 - load and register postgress driver software
    try {
        Class.forName("org.postgresql.Driver");//paste the quallified name of the postgress sql jar file driver class -> right click -> copy qualified name and paste it found  it in mavenRepository in google
        System.out.println("Load and registered");
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("Connection established");
    }catch (ClassNotFoundException | SQLException e){
        e.printStackTrace();
    }
    }
}
