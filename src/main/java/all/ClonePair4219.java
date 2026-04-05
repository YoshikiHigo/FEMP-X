package all;

import java.util.Iterator;
import java.util.List;

public class ClonePair4219 {

    boolean method1(List l,String name){
      for (Iterator i=l.iterator(); i.hasNext(); ) {
        String group=(String)i.next();
        if (group.equals(name))     return true;
      }
      return false;
    }

    boolean method2(List outputDataStrings,String accessorName){
      for (Iterator iterator=outputDataStrings.iterator(); iterator.hasNext(); ) {
        String data=(String)iterator.next();
        if (data.equalsIgnoreCase(accessorName)) {
          return true;
        }
      }
      return false;
    }
}
