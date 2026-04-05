package unverified;

import java.util.Iterator;
import java.util.List;

public class ClonePair1774 {

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
      StringBuffer buffer=new StringBuffer();
      for (int i=0; i < list.size(); i++) {
        buffer.append((i + 1) + "=" + list.get(i)).append("\n");
      }
      return buffer.toString();
    }
}
