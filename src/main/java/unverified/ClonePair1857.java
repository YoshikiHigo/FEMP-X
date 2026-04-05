package unverified;

import java.util.Iterator;
import java.util.List;

public class ClonePair1857 {

    String method1(List aList){
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

    String method2(List list){
      StringBuffer buffer=new StringBuffer();
      for (int i=0; i < list.size(); i++) {
        buffer.append((i + 1) + "=" + list.get(i)).append("\n");
      }
      return buffer.toString();
    }
}
