package inequivalent;

import java.util.Iterator;
import java.util.List;

public class ClonePair7259 {

    int method1(List l) {
        int sum = 0;
        for (Iterator i = l.iterator(); i.hasNext(); ) {
            sum += ((Number) i.next()).intValue();
        }
        System.out.println("PartialCalls.sum(" + l + ") = " + sum);
        return sum;
    }

    int method2(List arrayToSum) {
        int retVal = 0;
        Iterator it = arrayToSum.iterator();
        while (it.hasNext()) {
            Integer element = (Integer) it.next();
            retVal += element.intValue();
        }
        return retVal;
    }
}
