package equivalent;

import java.util.Iterator;
import java.util.Map;

public class ClonePair3760 {
    String method1(Map map, String name) {
        String best;
        String curr;
        int lastdot;
        Iterator i;
        if (map == null || name == null) {
            return null;
        }
        best = "";
        synchronized (map) {
            for (i = map.keySet().iterator(); i.hasNext(); ) {
                curr = (String) i.next();
                if (name.equals(curr)) {
                    best = curr;
                    break;
                }
                if ((lastdot = name.lastIndexOf(".")) >= 0) {
                    if (name.substring(0, lastdot).startsWith(curr) && curr.length() > best.length()) {
                        best = curr;
                    }
                }
            }
        }
        return best;
    }

    String method2(Map map, String target) {
        String best;
        String curr;
        int lastdot;
        Iterator i;
        if (map == null || target == null) {
            return null;
        }
        best = "";
        synchronized (map) {
            for (i = map.keySet().iterator(); i.hasNext(); ) {
                curr = (String) i.next();
                if (target.equals(curr)) {
                    best = curr;
                    break;
                }
                if ((lastdot = target.lastIndexOf(".")) >= 0) {
                    if (target.substring(0, lastdot).startsWith(curr) && (curr.length() > best.length())) {
                        best = curr;
                    }
                }
            }
        }
        return best;
    }
}
