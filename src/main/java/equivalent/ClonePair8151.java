package equivalent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ClonePair8151 {
    List method1(Map counts) {
        List result = new ArrayList(5);
        for (Iterator i = counts.keySet().iterator(); i.hasNext(); ) {
            Object node = i.next();
            int count = ((Integer) counts.get(node)).intValue();
            if (count == 0) result.add(node);
        }
        return result;
    }

    List method2(Map counts) {
        List result = new ArrayList(5);
        for (Iterator i = counts.keySet().iterator(); i.hasNext(); ) {
            Object node = i.next();
            int count = ((Integer) counts.get(node)).intValue();
            if (count == 0) {
                result.add(node);
            }
        }
        return result;
    }
}
