package unverified;

import java.util.Iterator;
import java.util.List;

public class ClonePair1855 {

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

    String method2(List objects){
      StringBuffer result=new StringBuffer();
      for (int i=0; i < objects.size(); i++) {
        result.append(objects.get(i)).append(' ');
      }
      return result.toString();
    }
}
