package all;

import java.util.*;

public class ClonePair67 {

    String method1(List strings,String delimiter){
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
