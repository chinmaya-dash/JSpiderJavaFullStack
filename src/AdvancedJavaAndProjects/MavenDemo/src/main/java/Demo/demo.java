package Demo;

import java.sql.*;

public class demo {
    private static final String url = "jdbc:postgresql://localhost:5432/college";
    private static final String user = "postgres";
    private static final String password = "123";
    public static void main(String[] args) {

        try {
//            step 1 - Loading and Registering
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver Loaded");

//            step 2 - Establishing Connection+*-
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Established");




//            step 3 - Create prepared Statement Object
//            String sql = "insert into student values(?, ?, ?)";
//            String sql = "delete from student where id = ?";
//              String sql = "update student set age=? where name=?" ;
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//
////            preparedStatement.setInt(1,13);
//            preparedStatement.setInt(1, 24);
//            preparedStatement.setString(2, "Gayana");
//
//            preparedStatement.addBatch();
//
////            preparedStatement.setInt(1,14);
//            preparedStatement.setInt(1, 25);
//            preparedStatement.setString(2, "Smruti");
//
//
//            preparedStatement.addBatch();
//
////            preparedStatement.setInt(1,15);
//            preparedStatement.setInt(1, 24);
//            preparedStatement.setString(2, "Udit");
//
//            preparedStatement.addBatch();
//
//            preparedStatement.executeBatch();

//            step 3 - creating statement
//            String sql = "insert into student values(111, 'Chinmaya Dash', 24)";
//            String sql2 = "delete from lectures where Name = 'deepak'";
//            String sql2 = "update student set id = 100, name = 'chinu', age = 25 where name = 'Chinmaya Dash'";
//                statement.execute(sql2);

//            For select query
            String sql = "select * from student where name = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "chinu");
//            preparedStatement.setString(1, "chinu");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                System.out.println("id : "+resultSet.getInt(1)+", name : "+resultSet.getString(2)+", age : "+resultSet.getInt(3));
            }


//            step 4 - executing query

            System.out.println("All data extracted");
//            boolean flag = statement.execute(sql2);
//            System.out.println("Data Saved...");
//            System.out.println(flag);

//            step 5 - closing connection
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

//        PreparedStatement  also can be used to execute static and dynamic query. we use setx() to take data input, here x is datatype of the value
//        it will also throw SQLExtension(),
//        Statement  is used to execute only static queries.
//        static query - passing value inside the query it is static query(hard coding)
//        dynamic query - dynamically passing the value inside the query is known as dynamic query
    }
}
