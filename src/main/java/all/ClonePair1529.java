package all;

import java.util.Collection;
import java.util.Iterator;

public class ClonePair1529 {

    boolean method1(Collection collectionA,Collection collectionB){
      if (collectionA == null && collectionB == null)   return true;
      if (collectionA == null || collectionB == null)   return false;
      if (collectionA.size() != collectionB.size())   return false;
      Iterator iteratorA=collectionA.iterator();
      while (iteratorA.hasNext()) {
        Object object=iteratorA.next();
        Iterator iteratorB=collectionB.iterator();
        boolean found=false;
        while (iteratorB.hasNext()) {
          Object another=iteratorB.next();
          if (another.equals(object))       found=true;
        }
        if (!found)     break;
      }
      return iteratorA.hasNext() ? false : true;
    }

    boolean method2(Collection c1,Collection c2){
      boolean equals;
      if (c1 == null) {
        equals=(c2 == null);
      }
     else   if (c2 == null) {
        equals=false;
      }
     else   if (c1.size() == c2.size()) {
        equals=true;
        Iterator iterC1=c1.iterator();
        Iterator iterC2=c2.iterator();
        while (equals && iterC1.hasNext() && iterC2.hasNext()) {
          Object o1=iterC1.next();
          Object o2=iterC2.next();
          equals=o1.equals(o2);
        }
      }
     else {
        equals=false;
      }
      return equals;
    }
}
