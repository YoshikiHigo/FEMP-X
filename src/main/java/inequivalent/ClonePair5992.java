package inequivalent;

import java.util.Enumeration;
import java.util.Vector;

public class ClonePair5992 {

    Vector method1(Vector v, Vector x) {
        Enumeration e = x.elements();
        while (e.hasMoreElements()) {
            String next = (String) e.nextElement();
            v.add(next);
        }
        return v;
    }

    Vector method2(Vector functionList, Vector blackNames) {
        for (int i = 0; i < blackNames.size(); i++) {
            String sBlack = (String) blackNames.elementAt(i);
            functionList.removeElement(sBlack);
        }
        return functionList;
    }
}
