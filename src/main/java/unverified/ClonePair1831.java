package unverified;

import java.util.Iterator;
import java.util.List;

public class ClonePair1831 {

    String method1(List lines){
      StringBuffer buffer=new StringBuffer();
      for (Iterator iterator=lines.iterator(); iterator.hasNext(); ) {
        String s=(String)iterator.next();
        buffer.append(s).append("\n");
      }
      return buffer.toString();
    }

    String method2(List list){
      StringBuffer result=new StringBuffer();
      for (Iterator it=list.iterator(); it.hasNext(); ) {
        result.append((String)it.next() + "\n");
      }
      return result.toString();
    }
}
