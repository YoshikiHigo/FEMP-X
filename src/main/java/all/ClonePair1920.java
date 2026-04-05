package all;

import java.util.Iterator;
import java.util.List;

public class ClonePair1920 {

    String method1(List list){
      StringBuffer result=new StringBuffer();
      if (list != null && list.size() > 0) {
        Iterator iter=list.iterator();
        while (iter.hasNext()) {
          result.append(iter.next());
          result.append(" ");
        }
        result.deleteCharAt(result.length() - 1);
      }
      return result.toString();
    }

    String method2(List list){
      StringBuffer sb=new StringBuffer();
      if (list != null) {
        boolean addComma=false;
        for (int i=0; i < list.size(); i++) {
          if (addComma) {
            sb.append(", ");
          }
          sb.append(list.get(i));
          addComma=true;
        }
      }
      return sb.toString();
    }
}
