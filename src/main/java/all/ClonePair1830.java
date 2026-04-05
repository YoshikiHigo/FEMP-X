package all;

import java.util.Iterator;
import java.util.List;

public class ClonePair1830 {

    String method1(List lines){
      StringBuffer buffer=new StringBuffer();
      for (Iterator iterator=lines.iterator(); iterator.hasNext(); ) {
        String s=(String)iterator.next();
        buffer.append(s).append("\n");
      }
      return buffer.toString();
    }

    String method2(List stringList){
      String string="";
      for (Iterator i=stringList.iterator(); i.hasNext(); ) {
        String line=(String)i.next();
        string+=line + "\n";
      }
      return string;
    }
}
