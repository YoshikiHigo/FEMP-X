package all;

import java.util.Iterator;
import java.util.List;

public class ClonePair1715 {

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

    String method2(List objects){
      StringBuffer result=new StringBuffer();
      for (int i=0; i < objects.size(); i++) {
        result.append(objects.get(i)).append(' ');
      }
      return result.toString();
    }
}
