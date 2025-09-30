package DSA.RaveeshConcepts;

import java.util.Comparator;

public class idCompareEmp implements Comparator{

    @Override
    public int compare(Object arg0, Object arg1) {
        Emp e1 = (Emp)arg0;
        Emp e2 = (Emp)arg1;
        
        return e1.id - e2.id;
    }
    
}
