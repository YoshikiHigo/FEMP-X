package unverified;

import java.util.*;

public class ClonePair8022 {

    String method1(Collection values){
      StringBuffer s=new StringBuffer();
      Iterator i=values.iterator();
      while (i.hasNext()) {
        s.append("'").append(i.next()).append("'");
        if (i.hasNext()) {
          s.append(", ");
        }
      }
      return s.toString();
    }

    String method2(Collection items){
      String string="";
      for (Iterator i=items.iterator(); i.hasNext(); ) {
        string+=i.next();
        if (i.hasNext()) {
          string+=",";
        }
      }
      return string;
    }
}
