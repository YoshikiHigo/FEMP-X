package equivalent;

import java.util.Collection;
import java.util.Iterator;

public class ClonePair8021 {
    String method1(Collection list) {
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator i = list.iterator();
        sb.append(i.next());
        while (i.hasNext()) {
            sb.append(",");
            sb.append(i.next());
        }
        return sb.toString();
    }

    String method2(Collection items) {
        String string = "";
        for (Iterator i = items.iterator(); i.hasNext(); ) {
            string += i.next();
            if (i.hasNext()) {
                string += ",";
            }
        }
        return string;
    }
}
