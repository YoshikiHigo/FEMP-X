package all;

import java.util.Iterator;
import java.util.List;

public class ClonePair1956 {

    String method1(List list){
      StringBuffer sb=new StringBuffer();
      for (Iterator it=list.iterator(); it.hasNext(); ) {
        sb.append((String)it.next());
        if (it.hasNext())     sb.append(", ");
      }
      return sb.toString();
    }

    String method2(List authors){
      String authorsString="";
      for (Iterator iter=authors.iterator(); iter.hasNext(); ) {
        String name=(String)iter.next();
        authorsString+=(name + ", ");
      }
      if (authorsString.length() >= 2) {
        authorsString=authorsString.substring(0,authorsString.length() - 2);
      }
      return authorsString;
    }
}
