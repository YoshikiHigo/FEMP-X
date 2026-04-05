package all;

import java.util.Iterator;
import java.util.List;

public class ClonePair1731 {

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

    String method2(List objects){
      StringBuffer result=new StringBuffer();
      for (int i=0; i < objects.size(); i++) {
        result.append(objects.get(i)).append(' ');
      }
      return result.toString();
    }
}
