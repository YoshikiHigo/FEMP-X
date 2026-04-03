package inequivalent;

import java.util.Iterator;
import java.util.Vector;

public class ClonePair8583 {

    boolean method1(String s, Vector<String> v) {
        if (v != null && s != null) {
            for (Iterator<String> iterator = v.iterator(); iterator.hasNext(); ) {
                String string = iterator.next();
                if (s.trim().compareTo(string.trim()) == 0) return true;
            }
        }
        return false;
    }

    boolean method2(String s, Vector<String> v) {
        if (v != null && s != null) {
            for (Iterator<String> iterator = v.iterator(); iterator.hasNext(); ) {
                String string = iterator.next();
                if (s.trim().toLowerCase().compareTo(string.trim().toLowerCase()) == 0) return true;
            }
        }
        return false;
    }
}
