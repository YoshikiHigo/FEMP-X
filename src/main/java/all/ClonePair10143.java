package all;

import java.util.Iterator;
import java.util.List;

public class ClonePair10143 {

    String method1(List list,char delim){
      int len=list.size();
      if (len == 0) {
        return "";
      }
      StringBuffer sb=new StringBuffer();
      for (int i=0; i < (len - 1); i++) {
        sb.append(list.get(i));
        sb.append(delim);
      }
      sb.append(list.get(len - 1));
      return sb.toString();
    }

    String method2(List pathStack,char separatorChar){
      final StringBuffer buffer=new StringBuffer();
      final Iterator iter=pathStack.iterator();
      if (iter.hasNext()) {
        buffer.append(iter.next());
      }
      while (iter.hasNext()) {
        buffer.append(separatorChar);
        buffer.append(iter.next());
      }
      return buffer.toString();
    }
}
