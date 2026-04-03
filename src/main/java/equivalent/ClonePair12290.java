package equivalent;

import java.util.Collection;
import java.util.Iterator;

public class ClonePair12290 {
    String method1(Collection s, String delimiter) {
        StringBuffer buffer = new StringBuffer();
        Iterator iter = s.iterator();
        while (iter.hasNext()) {
            buffer.append(iter.next());
            if (iter.hasNext()) {
                buffer.append(delimiter);
            }
        }
        return buffer.toString();
    }

    String method2(Collection objects, String separator) {
        if (objects.isEmpty()) return "";
        Iterator iter = objects.iterator();
        StringBuffer list = new StringBuffer();
        list.append(iter.next());
        while (iter.hasNext()) {
            list.append(separator);
            list.append(iter.next());
        }
        return list.toString();
    }
}
