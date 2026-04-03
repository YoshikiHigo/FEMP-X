package equivalent;

import java.util.Collection;
import java.util.Iterator;

public class ClonePair9296 {
    String[] method1(Collection c) {
        String[] ss = new String[c.size()];
        Iterator it = c.iterator();
        int i = 0;
        while (it.hasNext()) {
            ss[i++] = (String) it.next();
        }
        return ss;
    }

    String[] method2(Collection c) {
        Iterator iter = c.iterator();
        String s = null;
        String[] ret = new String[c.size()];
        int i = 0;
        while (iter.hasNext()) {
            s = (String) iter.next();
            ret[i] = s;
            i++;
        }
        return ret;
    }
}
