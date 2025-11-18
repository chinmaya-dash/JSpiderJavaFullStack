package school.service;

import school.entity.Student;

import java.sql.Connection;

public class StudentService {
private static final String url = "jdbc:postgresql://localhost:5432/college?user=postgres&password=123";

private static Connection connection;
static {
    try{
//     connection =
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}
public void save(Student student){
//    logic to save data in db
    String sql = "";
}
}
