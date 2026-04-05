package unverified;

import java.util.Iterator;
import java.util.List;

public class ClonePair1933 {

    String method1(List list){
      final StringBuffer sb=new StringBuffer();
      final Iterator it=list.iterator();
      if (it.hasNext())   sb.append(it.next());
      while (it.hasNext())   sb.append(", ").append(it.next());
      return sb.toString();
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
