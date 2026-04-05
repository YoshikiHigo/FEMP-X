package all;

import java.util.Iterator;
import java.util.List;

public class ClonePair1964 {

    String method1(List list){
      StringBuffer sb=new StringBuffer();
      for (Iterator it=list.iterator(); it.hasNext(); ) {
        sb.append((String)it.next());
        if (it.hasNext())     sb.append(", ");
      }
      return sb.toString();
    }

    String method2(List names){
      String objectNames="";
      for (Iterator it=names.iterator(); it.hasNext(); ) {
        String name=(String)it.next();
        objectNames+=name;
        if (it.hasNext())     objectNames+=", ";
      }
      return objectNames;
    }
}
