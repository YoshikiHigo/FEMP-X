package equivalent;

import java.util.Collection;
import java.util.Iterator;

public class ClonePair7852 {
    Object method1(Collection c) {
        Iterator i = c.iterator();
        Comparable min = (Comparable) i.next();
        while (i.hasNext()) {
            Object o = i.next();
            if (min.compareTo(o) > 0) {
                min = (Comparable) o;
            }
        }
        return min;
    }

    Object method2(Collection coll) {
        Iterator i = coll.iterator();
        Comparable candidate = (Comparable) (i.next());
        while (i.hasNext()) {
            Comparable next = (Comparable) (i.next());
            if (next.compareTo(candidate) < 0) candidate = next;
        }
        return candidate;
    }
}
