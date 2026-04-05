package all;

import java.util.*;

public class ClonePair5124 {

    boolean method1(Collection list,String val){
      for (Iterator iter=list.iterator(); iter.hasNext(); )   if (((String)iter.next()).equals(val))   return true;
      return false;
    }

    boolean method2(Collection strings,String o){
      if (o == null)   return false;
      for (Iterator iter=strings.iterator(); iter.hasNext(); ) {
        String element=(String)iter.next();
        if (element.equalsIgnoreCase(o))     return true;
      }
      return false;
    }
}
