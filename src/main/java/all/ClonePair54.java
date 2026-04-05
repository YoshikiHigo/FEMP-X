package all;

import java.util.*;

public class ClonePair54 {

    String method1(List src,String delim){
      StringBuffer ret=new StringBuffer();
      int i=0;
      for (Iterator iter=src.iterator(); iter.hasNext(); i++) {
        if (i > 0)     ret.append(delim);
        String element=(String)iter.next();
        ret.append(element);
      }
      return ret.toString();
    }

    String method2(List list,String splitSign){
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
}
