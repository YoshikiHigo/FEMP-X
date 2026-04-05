package unverified;

import java.util.*;

public class ClonePair62 {

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

    String method2(List strings,String delimiter){
      if (strings.isEmpty())   return "";
      Iterator i=strings.iterator();
      StringBuffer joined=new StringBuffer((String)i.next());
      for (; i.hasNext(); ) {
        String eachLine=(String)i.next();
        joined.append(delimiter);
        joined.append(eachLine);
      }
      return joined.toString();
    }
}
