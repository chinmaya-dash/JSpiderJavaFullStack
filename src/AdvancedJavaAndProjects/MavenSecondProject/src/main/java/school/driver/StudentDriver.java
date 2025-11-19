package school.driver;

import school.entity.Student;
import school.service.StudentService;

import java.util.Scanner;

public class StudentDriver {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Enter your choice");
            System.out.println("1: Insert data");
            System.out.println("2: Update data");
            System.out.println("3: Delete data");
            System.out.println("4: Fetch data");
            System.out.println("5: Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1: {
                    System.out.println("Enter your id ");
                    int id = sc.nextInt();

                    System.out.println("Enter your name ");
                    String name = sc.next();

                    System.out.println("Enter your age ");
                    int age = sc.nextInt();

                    Student student = new Student();
                    student.setId(id);
                    student.setName(name);
                    student.setAge(age);

                    int save = studentService.save(student);

                    if (save != 0) {
                        System.out.println("Data saved successfully");
                    }
                    break;
                }

                case 2: {
                    // update logic
                    break;
                }

                case 3: {
                    // delete logic
                    break;
                }

                case 4: {
                    // fetch logic
                    break;
                }

                case 5: {
                    System.out.println("Exiting...");
                    System.exit(0);
                }

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
