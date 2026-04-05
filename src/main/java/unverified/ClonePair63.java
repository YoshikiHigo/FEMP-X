package unverified;

import java.util.*;

public class ClonePair63 {

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

    String method2(List strings,String separators){
      StringBuffer sb=new StringBuffer();
      Iterator it=strings.iterator();
      while (it.hasNext()) {
        String s=(String)it.next();
        if (sb.length() > 0) {
          sb.append(separators);
        }
        sb.append(s);
      }
      return sb.toString();
    }
}
