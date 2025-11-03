package MockFinal.SecondMock.comparable;

public class Employee implements Comparable{
    String name;
    int id;
    float salary;
    private static int x = 100;

    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
        this.id = x++;
    }


    @Override
    public String toString(){
    return "Employee Details - "+name+" - "+ id+" - "+salary;
    }

    public int compareTo(Object org){
//        Employee e = (Employee) org;
        return name.compareTo(((Employee)org).name);
    }
}
