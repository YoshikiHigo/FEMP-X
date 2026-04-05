package all;

import java.util.Iterator;
import java.util.List;

public class ClonePair1670 {

    String method1(List data){
      StringBuffer sb=new StringBuffer();
      final String SEP="\t";
      for (int i=0; i < data.size(); i++) {
        if (i != 0)     sb.append(SEP);
        sb.append(data.get(i));
      }
      return sb.toString();
    }

    String method2(List nameList){
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
}
