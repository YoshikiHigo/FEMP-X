package all;

import java.util.Iterator;
import java.util.List;

public class ClonePair1678 {

    String method1(List data){
      StringBuffer sb=new StringBuffer();
      final String SEP="\t";
      for (int i=0; i < data.size(); i++) {
        if (i != 0)     sb.append(SEP);
        sb.append(data.get(i));
      }
      return sb.toString();
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
