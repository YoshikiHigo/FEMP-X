package all;

import java.util.*;

public class ClonePair66 {

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

    String method2(List strings,String delimiter){
      if (strings.isEmpty())   return "";
      Iterator i=strings.iterator();
      StringBuffer joined=new StringBuffer((String)i.next());
      for (; i.hasNext(); ) {
        String eachLine=(String)i.next();
        joined.append(delimiter);
        joined.append(eachLine);
      }
      return joined.toString();
    }
}
