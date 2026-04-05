package unverified;

import java.util.Iterator;
import java.util.List;

public class ClonePair1680 {

    String method1(List data){
      StringBuffer sb=new StringBuffer();
      final String SEP="\t";
      for (int i=0; i < data.size(); i++) {
        if (i != 0)     sb.append(SEP);
        sb.append(data.get(i));
      }
      return sb.toString();
    }

    String method2(List list){
      final StringBuffer sb=new StringBuffer();
      final Iterator it=list.iterator();
      if (it.hasNext())   sb.append(it.next());
      while (it.hasNext())   sb.append(", ").append(it.next());
      return sb.toString();
    }
}
