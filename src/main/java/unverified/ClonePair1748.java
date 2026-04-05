package unverified;

import java.util.Iterator;
import java.util.List;

public class ClonePair1748 {

    String method1(List localeNames){
      StringBuffer result=new StringBuffer();
      if (localeNames != null) {
        Iterator i=localeNames.iterator();
        while (i.hasNext()) {
          result.append(i.next().toString());
          if (i.hasNext()) {
            result.append(", ");
          }
        }
      }
      return result.toString();
    }

    String method2(List list){
      if ((list == null) || (list.size() == 0)) {
        return "";
      }
      StringBuffer buffer=new StringBuffer();
      buffer.append("(");
      buffer.append(list.get(0).toString());
      for (int i=1; i < list.size(); i++) {
        buffer.append(", ");
        buffer.append(list.get(i).toString());
      }
      buffer.append(")");
      return buffer.toString();
    }
}
