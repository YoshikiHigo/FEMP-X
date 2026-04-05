package unverified;

import java.util.Iterator;
import java.util.List;

public class ClonePair1763 {

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
      final StringBuffer sb=new StringBuffer();
      final Iterator it=list.iterator();
      if (it.hasNext())   sb.append(it.next());
      while (it.hasNext())   sb.append(", ").append(it.next());
      return sb.toString();
    }
}
