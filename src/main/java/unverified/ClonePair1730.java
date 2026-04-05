package unverified;

import java.util.Iterator;
import java.util.List;

public class ClonePair1730 {

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
      StringBuffer strBuf=new StringBuffer();
      int size=list.size();
      for (int i=0; i < size; i++) {
        strBuf.append((i > 0 ? "," : "") + list.get(i));
      }
      return strBuf.toString();
    }
}
