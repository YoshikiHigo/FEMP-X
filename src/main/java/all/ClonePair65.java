package all;

import java.util.*;

public class ClonePair65 {

    String method1(List sequence,String separator){
      String result="";
      for (Iterator iter=sequence.iterator(); iter.hasNext(); ) {
        String value=(String)iter.next();
        if (iter.hasNext()) {
          result=result + value + separator;
        }
     else {
          result=result + value;
        }
      }
      return result;
    }

    String method2(List strings,String separators){
      StringBuffer sb=new StringBuffer();
      Iterator it=strings.iterator();
      while (it.hasNext()) {
        String s=(String)it.next();
        if (sb.length() > 0) {
          sb.append(separators);
        }
        sb.append(s);
      }
      return sb.toString();
    }
}
