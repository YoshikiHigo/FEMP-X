package inequivalent;

import java.util.Enumeration;
import java.util.Vector;

public class ClonePair5999 {

    Vector method1(Vector theVector, Vector elementsToAdd) {
        for (Enumeration stream = elementsToAdd.elements(); stream.hasMoreElements(); ) {
            Object element = stream.nextElement();
            if (!theVector.contains(element)) {
                theVector.addElement(element);
            }
        }
        return theVector;
    }

    Vector method2(Vector a, Vector b) {
        Enumeration vectEnum = b.elements();
        while (vectEnum.hasMoreElements()) {
            a.addElement(vectEnum.nextElement());
        }
        vectEnum = null;
        b = null;
        return a;
    }
}
