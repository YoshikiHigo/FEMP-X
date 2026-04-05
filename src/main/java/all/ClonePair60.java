package all;

import java.util.*;

public class ClonePair60 {

    String method1(List list,String delim){
      if (list == null || list.size() < 1) {
        return null;
      }
      StringBuffer buf=new StringBuffer();
      Iterator i=list.iterator();
      while (i.hasNext()) {
        buf.append((String)i.next());
        if (i.hasNext()) {
          buf.append(delim);
        }
      }
      return buf.toString();
    }

    String method2(List list,String delim){
      if (list == null || list.size() < 1)   return null;
      StringBuffer buf=new StringBuffer();
      Iterator i=list.iterator();
      while (i.hasNext()) {
        buf.append((String)i.next());
        if (i.hasNext())     buf.append(delim);
      }
      return buf.toString();
    }
}
