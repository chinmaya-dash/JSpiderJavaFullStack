package school.service;

import school.entity.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentService {
    private static   Connection connection;
    private static final String url = "jdbc:postgresql://localhost:5432/college?user=postgres&password=123";

    static {
    try{
        Class.forName("org.postgresql.Driver");

         connection = DriverManager.getConnection(url);
        System.out.println("Connection Established");


    } catch (SQLException | ClassNotFoundException e) {
        e.printStackTrace();
    }
}
    public int save(Student student) {

        String sql = "INSERT INTO student (id, name, age) VALUES (?, ?, ?)";
        int res = 0;

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, student.getId());
            ps.setString(2, student.getName());
            ps.setInt(3, student.getAge());

            res = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return res;
    }

    public int update(Student student)  {
        String sql = "update student set age=? where name=?" ;
        int result = 0;

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, student.getAge());
            preparedStatement.setString(2, student.getName());
//            preparedStatement.setInt(1, student.getId());

            result = preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return result;
    }

    public int delete(int  id){
        String sql = "delete from student where id = ?";
        int result = 0;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            result = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

}
