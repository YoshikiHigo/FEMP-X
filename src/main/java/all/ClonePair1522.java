package all;

import java.util.Collection;
import java.util.Iterator;

public class ClonePair1522 {

    boolean method1(Collection objC1,Collection objC2){
      boolean result=true;
      if (objC1.size() != objC2.size())   result=false;
      Iterator it=objC1.iterator();
      while (it.hasNext())   if (!objC2.contains(it.next()))   result=false;
      return result;
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
