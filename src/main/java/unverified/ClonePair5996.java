package unverified;

import java.util.*;

public class ClonePair5996 {

    Vector method1(Vector v1,Vector v2){
      for (int i=0; i < v2.size(); i++) {
        v1.add(v2.get(i));
      }
      return v1;
    }

    Vector method2(Vector a,Vector b){
      Enumeration vectEnum=b.elements();
      while (vectEnum.hasMoreElements()) {
        a.addElement(vectEnum.nextElement());
      }
      vectEnum=null;
      b=null;
      return a;
    }
}
