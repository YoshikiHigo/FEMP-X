package all;

import java.util.Collection;
import java.util.Iterator;

public class ClonePair1521 {

    boolean method1(Collection objC1,Collection objC2){
      boolean result=true;
      if (objC1.size() != objC2.size())   result=false;
      Iterator it=objC1.iterator();
      while (it.hasNext())   if (!objC2.contains(it.next()))   result=false;
      return result;
    }

    boolean method2(Collection c1,Collection c2){
      for (Iterator i=c1.iterator(); i.hasNext(); ) {
        if (c2.contains(i.next()))     return true;
      }
      return false;
    }
}
