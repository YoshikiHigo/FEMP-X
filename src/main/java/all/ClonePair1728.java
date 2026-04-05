package all;

import java.util.Iterator;
import java.util.List;

public class ClonePair1728 {

    String method1(List allowedMethods){
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

    String method2(List tokens){
      StringBuffer buffer=new StringBuffer();
      Iterator itr=tokens.iterator();
      while (itr.hasNext()) {
        buffer.append(itr.next());
      }
      return buffer.toString();
    }
}
