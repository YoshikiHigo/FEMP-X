package all;

import java.util.*;

public class ClonePair57 {

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
