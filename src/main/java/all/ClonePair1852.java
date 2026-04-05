package all;

import java.util.Iterator;
import java.util.List;

public class ClonePair1852 {

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

    String method2(List tokens){
      StringBuffer buffer=new StringBuffer();
      Iterator itr=tokens.iterator();
      while (itr.hasNext()) {
        buffer.append(itr.next());
      }
      return buffer.toString();
    }
}
