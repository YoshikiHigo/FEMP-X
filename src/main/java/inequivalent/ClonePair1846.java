package inequivalent;

import java.util.Iterator;
import java.util.List;

public class ClonePair1846 {

    String method1(List aList) {
        StringBuffer buffer = new StringBuffer();
        Iterator i = aList.iterator();
        if (i.hasNext()) {
            buffer.append(i.next());
            while (i.hasNext()) {
                buffer.append(' ');
                buffer.append(i.next());
            }
        }
        return buffer.toString();
    }

    String method2(List list) {
        final StringBuffer sb = new StringBuffer();
        final Iterator it = list.iterator();
        if (it.hasNext()) sb.append(it.next());
        while (it.hasNext()) sb.append(", ").append(it.next());
        return sb.toString();
    }
}
