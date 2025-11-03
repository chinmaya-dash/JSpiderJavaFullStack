package MockFinal.SecondMock.comparable;

import java.util.Arrays;

public class testEmp1 {
    public static void main(String[] args) {
        Employee[] e = {
                new Employee("chinmaya", 1500001),
                new Employee("arundhati", 1500004),
                new Employee("lopa", 1500003),
                new Employee("pramod", 1500005),
                new Employee("chinu", 1500002)
        };

        Arrays.sort(e, new idComparision());
        System.out.println(Arrays.toString(e));
    }
}
