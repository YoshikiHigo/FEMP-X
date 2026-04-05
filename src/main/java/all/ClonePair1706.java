package all;

import java.util.Iterator;
import java.util.List;

public class ClonePair1706 {

    String method1(List nameList){
      StringBuffer retVal=new StringBuffer();
      Iterator it=nameList.iterator();
      boolean first=true;
      while (it.hasNext()) {
        if (first) {
          first=false;
        }
     else {
          retVal.append(";");
        }
        retVal.append(it.next());
      }
      return retVal.toString();
    }

    String method2(List aList){
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
}
