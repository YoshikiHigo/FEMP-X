package all;

import java.util.Iterator;
import java.util.List;

public class ClonePair1934 {

    String method1(List list){
      final StringBuffer sb=new StringBuffer();
      final Iterator it=list.iterator();
      if (it.hasNext())   sb.append(it.next());
      while (it.hasNext())   sb.append(", ").append(it.next());
      return sb.toString();
    }

    String method2(List list){
      StringBuffer buffer=new StringBuffer();
      for (int i=0; i < list.size(); i++) {
        buffer.append((i + 1) + "=" + list.get(i)).append("\n");
      }
      return buffer.toString();
    }
}
