package all;

import java.util.Iterator;
import java.util.List;

public class ClonePair1967 {

    String method1(List authors){
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
