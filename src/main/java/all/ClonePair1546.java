package all;

import java.util.Collection;
import java.util.Iterator;

public class ClonePair1546 {

    boolean method1(Collection c1,Collection c2){
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
        while (equals && iterC1.hasNext()) {
          Object o1=iterC1.next();
          equals=c2.contains(o1);
        }
      }
     else {
        equals=false;
      }
      return equals;
    }

    boolean method2(Collection c1,Collection c2){
      if ((c1 == null) || (c2 == null))   return c1 == c2;
      if (c1.size() != c2.size())   return false;
      for (Iterator it=c1.iterator(); it.hasNext(); ) {
        Object obj=it.next();
        if (!c2.contains(obj))     return false;
      }
      return true;
    }
}
