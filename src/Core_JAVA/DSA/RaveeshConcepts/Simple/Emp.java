package DSA.RaveeshConcepts.Simple;

public class Emp implements Comparable{
    public String name;
    public int id;
    public Float salary;
    static int x = 100;
    public Emp(String name, float salary){
        this.salary = salary;
        this.name = name;
        this.id = x++;
    }

      @Override
    public int compareTo(Object arg0) {
        Emp e = ((Emp)arg0);
        return name.compareTo(e.name);
    }

    @Override
    public String toString(){
        return "Employee[name = "+name+", Id = "+id+", Salary = "+salary+"]";
    }
    
}
