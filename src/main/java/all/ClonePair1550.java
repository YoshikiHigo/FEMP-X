package all;

import java.util.Collection;
import java.util.Iterator;

public class ClonePair1550 {

    boolean method1(Collection coll1,Collection coll2){
      if (coll1.size() < coll2.size()) {
        for (Iterator it=coll1.iterator(); it.hasNext(); ) {
          if (coll2.contains(it.next())) {
            return true;
          }
        }
      }
     else {
        for (Iterator it=coll2.iterator(); it.hasNext(); ) {
          if (coll1.contains(it.next())) {
            return true;
          }
        }
      }
      return false;
    }

    boolean method2(Collection c1,Collection c2){
      Collection smallCollection;
      Collection largeCollection;
      if (c1.size() < c2.size()) {
        smallCollection=c1;
        largeCollection=c2;
      }
     else {
        smallCollection=c2;
        largeCollection=c1;
      }
      boolean intersect=false;
      Iterator i=smallCollection.iterator();
      while (i.hasNext()) {
        if (largeCollection.contains(i.next())) {
          intersect=true;
          break;
        }
      }
      return intersect;
    }
}
