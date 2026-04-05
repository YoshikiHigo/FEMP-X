package all;

import java.util.*;

public class ClonePair5998 {

    Vector method1(Vector a,Vector b){
      for (int i=0; i < b.size(); i++) {
        if (!a.contains(b.elementAt(i)))     a.addElement(b.elementAt(i));
      }
      return a;
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
