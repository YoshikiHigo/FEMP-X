package inequivalent;

import java.util.Collection;
import java.util.Iterator;

public class ClonePair11012 {

    int method1(Collection in) {
        int sum = 0;
        Iterator sIt = in.iterator();
        while (sIt.hasNext()) sum += ((Integer) sIt.next()).intValue();
        return sum;
    }

    int method2(Collection c) {
        int result = 0;
        for (Iterator i = c.iterator(); i.hasNext(); ) {
            int value = ((Number) i.next()).intValue();
            result += value;
        }
        return result;
    }
}
