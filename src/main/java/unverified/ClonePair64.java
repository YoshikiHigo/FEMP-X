package unverified;

import java.util.*;

public class ClonePair64 {

    String method1(List list,String delimiter){
      String returnValue=null;
      if (list != null) {
        if (list.size() > 0) {
          StringBuffer buffer=new StringBuffer();
          String separator="";
          Iterator i=list.iterator();
          while (i.hasNext()) {
            buffer.append(separator);
            buffer.append((String)i.next());
            separator=delimiter;
          }
          returnValue=buffer.toString();
        }
      }
      return returnValue;
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
