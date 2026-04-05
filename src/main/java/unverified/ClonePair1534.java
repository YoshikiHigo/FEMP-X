package unverified;

import java.util.Collection;
import java.util.Iterator;

public class ClonePair1534 {

    boolean method1(Collection c1,Collection c2){
      for (Iterator i=c1.iterator(); i.hasNext(); ) {
        if (c2.contains(i.next()))     return true;
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
