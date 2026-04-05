package unverified;

import java.util.Collection;
import java.util.Iterator;

public class ClonePair1533 {

    boolean method1(Collection c1,Collection c2){
      for (Iterator i=c1.iterator(); i.hasNext(); ) {
        if (c2.contains(i.next()))     return true;
      }
      return false;
    }

    boolean method2(Collection coll1,Collection coll2){
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
}
