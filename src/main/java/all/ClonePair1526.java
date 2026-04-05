package all;

import java.util.Collection;
import java.util.Iterator;

public class ClonePair1526 {

    boolean method1(Collection objC1,Collection objC2){
      boolean result=true;
      if (objC1.size() != objC2.size())   result=false;
      Iterator it=objC1.iterator();
      while (it.hasNext())   if (!objC2.contains(it.next()))   result=false;
      return result;
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
