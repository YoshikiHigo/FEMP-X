package unverified;

import java.util.Iterator;
import java.util.List;

public class ClonePair1725 {

    String method1(List allowedMethods){
      Iterator iter=allowedMethods.iterator();
      StringBuffer strbuf=new StringBuffer();
      while (iter.hasNext()) {
        strbuf.append(iter.next());
        if (iter.hasNext()) {
          strbuf.append(",");
        }
      }
      return strbuf.toString();
    }

    String method2(List aList){
      StringBuffer buffer=new StringBuffer();
      Iterator i=aList.iterator();
      if (i.hasNext()) {
        buffer.append(i.next());
        while (i.hasNext()) {
          buffer.append(' ');
          buffer.append(i.next());
        }
      }
      return buffer.toString();
    }
}
