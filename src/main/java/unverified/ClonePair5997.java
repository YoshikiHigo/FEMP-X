package unverified;

import java.util.*;

public class ClonePair5997 {

    Vector method1(Vector a,Vector b){
      for (int i=0; i < b.size(); i++) {
        if (!a.contains(b.elementAt(i)))     a.addElement(b.elementAt(i));
      }
      return a;
    }

    Vector method2(Vector theVector,Vector elementsToAdd){
      for (Enumeration stream=elementsToAdd.elements(); stream.hasMoreElements(); ) {
        Object element=stream.nextElement();
        if (!theVector.contains(element)) {
          theVector.addElement(element);
        }
      }
      return theVector;
    }
}
