package school.service;

import school.entity.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

    public Student fetch(int id) {
        String sql = "SELECT * FROM student WHERE id = ?";
        Student student = null;

        try {
            PreparedStatement prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setInt(1, id);

            ResultSet resultSet = prepareStatement.executeQuery();

            if (resultSet.next()) {
                student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setAge(resultSet.getInt("age"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return student;
    }


    public List<Student> fetchAll() {
        String sql = "SELECT * FROM student";
        List<Student> list = new LinkedList<>();

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next())System.out.println("Data fetched successfully");

            while(resultSet.next()){
                list.add(new Student(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3)));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean exit(){
        boolean flag = false;
        try {
            connection.close();
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }


}
