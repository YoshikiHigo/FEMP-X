package all;

import java.util.Iterator;
import java.util.List;

public class ClonePair1935 {

    String method1(List list){
      final StringBuffer sb=new StringBuffer();
      final Iterator it=list.iterator();
      if (it.hasNext())   sb.append(it.next());
      while (it.hasNext())   sb.append(", ").append(it.next());
      return sb.toString();
    }

    String method2(List objects){
      StringBuffer result=new StringBuffer();
      for (int i=0; i < objects.size(); i++) {
        result.append(objects.get(i)).append(' ');
      }
      return result.toString();
    }
}
