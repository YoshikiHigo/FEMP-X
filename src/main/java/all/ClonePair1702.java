package all;

import java.util.Iterator;
import java.util.List;

public class ClonePair1702 {

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

    String method2(List allowedMethods){
      Iterator iter=allowedMethods.iterator();
      StringBuffer strbuf=new StringBuffer();
      while (iter.hasNext()) {
        strbuf.append(iter.next());
        if (iter.hasNext()) {
          strbuf.append(",");
        }
      }
      return strbuf.toString();
    }
}
