package DSA.RaveeshConcepts.Simple;

import java.util.Arrays;

public class EmpTest {
    public static void main(String[] args) {
        Emp[] e = {
                new Emp("chinmaya", 12000),
                new Emp("Sabir", 10000),
                new Emp("chinu", 30000),
                new Emp("john", 3200)
        };
        // Arrays.sort(e);
        // Arrays.sort(e, new salCompare());
        // Arrays.sort(e, new idCompareEmp());
        Arrays.sort(e, new lengthEmpName());

        for (Emp emp : e) {
            System.out.println(Arrays.toString(e));
        }
    }
}
