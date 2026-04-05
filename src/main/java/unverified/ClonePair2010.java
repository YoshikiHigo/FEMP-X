package unverified;

import java.util.Iterator;
import java.util.List;

public class ClonePair2010 {

    String method1(List stringList){
      String string="";
      for (Iterator i=stringList.iterator(); i.hasNext(); ) {
        String line=(String)i.next();
        string+=line + "\n";
      }
      return string;
    }

    String method2(List list){
      StringBuffer result=new StringBuffer();
      for (Iterator it=list.iterator(); it.hasNext(); ) {
        result.append((String)it.next() + "\n");
      }
      return result.toString();
    }
}
