package inequivalent;

import java.util.Vector;

public class ClonePair5994 {

    Vector method1(Vector v1, Vector v2) {
        for (int i = 0; i < v2.size(); i++) {
            v1.add(v2.get(i));
        }
        return v1;
    }

    Vector method2(Vector a, Vector b) {
        for (int i = 0; i < b.size(); i++) {
            if (!a.contains(b.elementAt(i))) a.addElement(b.elementAt(i));
        }
        return a;
    }
}
