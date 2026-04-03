package equivalent;

import java.util.Iterator;
import java.util.Vector;

public class ClonePair6681 {
    int method1(Vector v) {
        int sum = 0;
        Iterator it = v.iterator();
        while (it.hasNext()) {
            Integer val = (Integer) it.next();
            sum += val.intValue();
        }
        return sum;
    }

    int method2(Vector hand) {
        int result = 0;
        for (int i = 0; i < hand.size(); i++) {
            result += ((Integer) hand.elementAt(i)).intValue();
        }
        return result;
    }
}
