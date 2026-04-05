package all;

import java.util.Collection;
import java.util.Iterator;

public class ClonePair1532 {

    boolean method1(Collection c1,Collection c2){
      for (Iterator i=c1.iterator(); i.hasNext(); ) {
        if (c2.contains(i.next()))     return true;
      }
      return false;
    }

    boolean method2(Collection first,Collection second){
      if (first.size() != second.size()) {
        return false;
      }
      for (Iterator i=first.iterator(); i.hasNext(); ) {
        Object obj=i.next();
        if (!second.contains(obj)) {
          return false;
        }
      }
      return true;
    }
}
