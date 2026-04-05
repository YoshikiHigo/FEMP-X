package all;

import java.util.Iterator;
import java.util.List;

public class ClonePair1712 {

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

    String method2(List tokens){
      StringBuffer buffer=new StringBuffer();
      Iterator itr=tokens.iterator();
      while (itr.hasNext()) {
        buffer.append(itr.next());
      }
      return buffer.toString();
    }
}
