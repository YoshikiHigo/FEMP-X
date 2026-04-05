package unverified;

import java.util.*;

public class ClonePair61 {

    String method1(List list,String splitSign){
      String result="";
      if (!list.isEmpty()) {
        int xc=0;
        for (Iterator i=list.listIterator(); i.hasNext(); xc++) {
          if (xc > 0)       result+=splitSign;
          result+=(String)i.next();
        }
      }
      return result;
    }

    String method2(List sequence,String separator){
      String result="";
      for (Iterator iter=sequence.iterator(); iter.hasNext(); ) {
        String value=(String)iter.next();
        if (iter.hasNext()) {
          result=result + value + separator;
        }
     else {
          result=result + value;
        }
      }
      return result;
    }
}
