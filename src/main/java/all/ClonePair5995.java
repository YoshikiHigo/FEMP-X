package all;

import java.util.*;

public class ClonePair5995 {

    Vector method1(Vector v1,Vector v2){
      for (int i=0; i < v2.size(); i++) {
        v1.add(v2.get(i));
      }
      return v1;
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
