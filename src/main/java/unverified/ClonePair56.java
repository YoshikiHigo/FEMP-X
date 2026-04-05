package unverified;

import java.util.*;

public class ClonePair56 {

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
