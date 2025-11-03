package JSpiderJavaFullStack.oops.MyTest;

// Base class for all users
abstract class User {
    private static User currentUser;  // tracks who is currently active

    public static void setCurrentUser(User user) {
        currentUser = user;
    }

    public static User getCurrentUser() {
        return currentUser;
    }

    public abstract String getRole();
}

// -------------------- Manager --------------------
class Manager extends User {
    private String name;
    private int id;
    private float salary;
    private long number;

    @Override
    public String getRole() {
        return "Manager";
    }

    public void approveSalaryChange(Employee e, float newSalary) {
        if (User.getCurrentUser() instanceof Manager) {
            e.setSalary(newSalary);
            System.out.println("✅ Manager approved salary update for: " + e.getName());
        } else {
            System.out.println("❌ Access denied! Only Manager can approve salary changes.");
        }
    }

    // Manager getters/setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public float getSalary() { return salary; }
    public void setSalary(float salary) { this.salary = salary; }
    public long getNumber() { return number; }
    public void setNumber(long number) { this.number = number; }
}

// -------------------- Employee --------------------
class Employee extends User {
    private String name;
    private int id;
    private long number;
    private float salary;

    @Override
    public String getRole() {
        return "Employee";
    }

    // Employee trying to update own data
    public void updateOwnDetails(String name, long number) {
        if (User.getCurrentUser() instanceof Employee &&
                User.getCurrentUser() == this) {
            this.name = name;
            this.number = number;
            System.out.println("✅ Employee updated own details successfully.");
        } else {
            System.out.println("❌ Access denied! You can only update your own details.");
        }
    }

    public void viewOwnDetails() {
        System.out.println("👤 Employee Details:");
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public long getNumber() { return number; }
    public void setNumber(long number) { this.number = number; }
    public float getSalary() { return salary; }
    public void setSalary(float salary) { this.salary = salary; }
}

// -------------------- Main Class --------------------
public class UserEmployee {

    public static void main(String[] args) {
        // Create Manager and Employee objects
        Manager m = new Manager();
        m.setName("Mr. Smith");
        m.setId(101);

        Employee e1 = new Employee();
        e1.setName("Chinmaya");
        e1.setId(201);
        e1.setSalary(25000);

        // -------------------------
        // Manager logs in
        // -------------------------
        User.setCurrentUser(m);
        System.out.println("🔐 Current User: " + User.getCurrentUser().getRole());

        m.approveSalaryChange(e1, 30000); // Manager can approve
        e1.viewOwnDetails();

        // -------------------------
        // Employee logs in
        // -------------------------
        User.setCurrentUser(e1);
        System.out.println("\n🔐 Current User: " + User.getCurrentUser().getRole());

        e1.updateOwnDetails("Chinmaya Dash", 9876543210L); // Works
        e1.viewOwnDetails();

        // Employee trying restricted action
        e1.updateOwnDetails("Fake", 123L); // Works only if current user == e1
    }
}
