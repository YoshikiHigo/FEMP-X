package equivalent;

import java.util.Iterator;
import java.util.List;

public class ClonePair4135 {
    List method1(List list1, List list2) {
        for (Iterator iter = list2.iterator(); iter.hasNext(); ) {
            Object obj = iter.next();
            if (!(list1.contains(obj))) {
                list1.add(obj);
            }
        }
        return list1;
    }

    List method2(List to, List from) {
        for (int i = 0, max = from.size(); i < max; i++) {
            final Object object = from.get(i);
            if (!to.contains(object)) {
                to.add(object);
            }
        }
        return to;
    }
}
