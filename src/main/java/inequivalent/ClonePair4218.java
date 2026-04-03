package inequivalent;

import java.util.Iterator;
import java.util.List;

public class ClonePair4218 {

    boolean method1(List list, String string) {
        for (int i = 0; i < list.size(); i++) {
            String element = (String) list.get(i);
            if (element.indexOf(string) != -1) {
                return true;
            }
        }
        return false;
    }

    boolean method2(List l, String name) {
        for (Iterator i = l.iterator(); i.hasNext(); ) {
            String group = (String) i.next();
            if (group.equals(name)) return true;
        }
        return false;
    }
}
