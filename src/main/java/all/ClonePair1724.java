package all;

import java.util.Iterator;
import java.util.List;

public class ClonePair1724 {

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

    String method2(List list){
      StringBuffer b=new StringBuffer();
      for (Iterator i=list.iterator(); i.hasNext(); ) {
        b.append(i.next());
        if (i.hasNext()) {
          b.append(", ");
        }
      }
      return b.toString();
    }
}
