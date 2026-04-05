package unverified;

import java.util.Iterator;
import java.util.List;

public class ClonePair1718 {

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

    String method2(List list){
      StringBuffer buffer=new StringBuffer();
      for (int i=0; i < list.size(); i++) {
        buffer.append((i + 1) + "=" + list.get(i)).append("\n");
      }
      return buffer.toString();
    }
}
