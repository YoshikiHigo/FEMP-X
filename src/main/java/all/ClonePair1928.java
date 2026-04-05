package all;

import java.util.Iterator;
import java.util.List;

public class ClonePair1928 {

    String method1(List digits){
      Iterator iterator=digits.iterator();
      String number="";
      while (iterator.hasNext()) {
        number=number + (String)iterator.next();
      }
      return number;
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
