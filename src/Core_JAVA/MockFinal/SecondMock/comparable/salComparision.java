package MockFinal.SecondMock.comparable;

import java.util.Comparator;

public class salComparision implements Comparator {

    @Override
    public int compare(Object arg1, Object arg2) {
        if (((Employee) arg1).salary < ((Employee)arg2).salary) return 1;
        else if (((Employee) arg1).salary > ((Employee)arg2).salary) return -1;
        else return 0;
    }
}
