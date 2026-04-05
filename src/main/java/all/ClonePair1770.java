package all;

import java.util.Iterator;
import java.util.List;

public class ClonePair1770 {

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

    String method2(List tokens){
      StringBuffer buffer=new StringBuffer();
      Iterator itr=tokens.iterator();
      while (itr.hasNext()) {
        buffer.append(itr.next());
      }
      return buffer.toString();
    }
}
