package inequivalent;

import java.util.Collection;
import java.util.Iterator;

public class ClonePair1536 {

    boolean method1(Collection first, Collection second) {
        if (first.size() != second.size()) {
            return false;
        }
        for (Iterator i = first.iterator(); i.hasNext(); ) {
            Object obj = i.next();
            if (!second.contains(obj)) {
                return false;
            }
        }
        return true;
    }

    boolean method2(Collection c1, Collection c2) {
        Collection smallCollection;
        Collection largeCollection;
        if (c1.size() < c2.size()) {
            smallCollection = c1;
            largeCollection = c2;
        } else {
            smallCollection = c2;
            largeCollection = c1;
        }
        boolean intersect = false;
        Iterator i = smallCollection.iterator();
        while (i.hasNext()) {
            if (largeCollection.contains(i.next())) {
                intersect = true;
                break;
            }
        }
        return intersect;
    }
}
