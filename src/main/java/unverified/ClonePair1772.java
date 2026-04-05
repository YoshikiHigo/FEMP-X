package unverified;

import java.util.Iterator;
import java.util.List;

public class ClonePair1772 {

    String method1(List list){
      StringBuffer b=new StringBuffer();
      for (Iterator i=list.iterator(); i.hasNext(); ) {
        b.append(i.next());
        if (i.hasNext()) {
          b.append(", ");
        }
      }
      return b.toString();
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
