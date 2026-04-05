package unverified;

import java.util.*;

public class ClonePair55 {

    String method1(List src,String delim){
      StringBuffer ret=new StringBuffer();
      int i=0;
      for (Iterator iter=src.iterator(); iter.hasNext(); i++) {
        if (i > 0)     ret.append(delim);
        String element=(String)iter.next();
        ret.append(element);
      }
      return ret.toString();
    }

    String method2(List sequence,String separator){
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
}
