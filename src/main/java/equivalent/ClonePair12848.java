package equivalent;

import java.util.Collection;
import java.util.Iterator;

public class ClonePair12848 {
    boolean method1(Collection coll) {
        if (coll.isEmpty()) {
            return false;
        }
        Object candidate = null;
        for (Iterator it = coll.iterator(); it.hasNext(); ) {
            Object elem = it.next();
            if (candidate == null) {
                candidate = elem;
            } else if (candidate != elem) {
                return false;
            }
        }
        return true;
    }

    boolean method2(Collection coll) {
        if (coll.isEmpty()) {
            return false;
        }
        boolean hasCandidate = false;
        Object candidate = null;
        for (Iterator it = coll.iterator(); it.hasNext(); ) {
            Object elem = it.next();
            if (!hasCandidate) {
                hasCandidate = true;
                candidate = elem;
            } else if (candidate != elem) {
                return false;
            }
        }
        return true;
    }
}
