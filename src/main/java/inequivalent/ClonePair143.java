package inequivalent;

import java.util.Enumeration;
import java.util.Vector;

public class ClonePair143 {

    int method1(Vector v, String s) {
        for (Enumeration e = v.elements(); e.hasMoreElements(); ) {
            String tmp = (String) e.nextElement();
            if (tmp.compareTo(s) == 0) return v.indexOf(tmp);
        }
        return -1;
    }

    int method2(Vector genes, String gene) {
        for (int i = 0; i < genes.size(); i++) {
            if (gene.toUpperCase().compareTo(((String) genes.elementAt(i)).toUpperCase()) == 0) {
                return i;
            }
        }
        return -1;
    }
}
