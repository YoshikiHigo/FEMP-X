package equivalent;

import java.util.Enumeration;
import java.util.Vector;

public class ClonePair9055 {
    Object method1(Object a1, Object a2) {
        if (a1 == null) return a2;
        if (a2 == null) return a1;
        if (a1 instanceof Vector) if (a2 instanceof Vector) {
            for (Enumeration e = ((Vector) a2).elements(); e.hasMoreElements(); )
                ((Vector) a1).addElement(e.nextElement());
            return a1;
        } else {
            ((Vector) a1).addElement(a2);
            return a1;
        }
        else if (a2 instanceof Vector) {
            ((Vector) a2).addElement(a1);
            return a2;
        } else {
            Vector v = new Vector();
            v.addElement(a1);
            v.addElement(a2);
            return v;
        }
    }

    Object method2(Object a1, Object a2) {
        if (a1 == null) return a2;
        if (a2 == null) return a1;
        if (a1 instanceof Vector) if (a2 instanceof Vector) {
            for (Enumeration e = ((Vector) a2).elements(); e.hasMoreElements(); )
                ((Vector) a1).addElement(e.nextElement());
            return a1;
        } else {
            ((Vector) a1).addElement(a2);
            return a1;
        }
        else if (a2 instanceof Vector) {
            ((Vector) a2).addElement(a1);
            return a2;
        } else {
            Vector<Object> v = new Vector<Object>();
            v.addElement(a1);
            v.addElement(a2);
            return v;
        }
    }
}
