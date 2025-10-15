package JSpiderJavaFullStack.MockFinal.SecondMock.comparable;

import java.util.Comparator;

public class idComparision implements Comparator {

    @Override
    public int compare(Object arg1, Object arg2) {
        if (((Employee)arg1).id > ((Employee)arg2).id)return 1;
        if (((Employee)arg1).id < ((Employee)arg2).id)return -1;
        return 0;
    }
}
