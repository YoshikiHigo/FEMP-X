package all;

import java.util.*;

public class ClonePair8020 {

    String method1(Collection qualifiedName){
      String result="";
      for (Iterator iter=qualifiedName.iterator(); iter.hasNext(); ) {
        result+=(String)iter.next() + ".";
      }
      return result.substring(0,result.length() - 1);
    }

    String method2(Collection apex){
      StringBuffer buffer=new StringBuffer();
      Iterator it=apex.iterator();
      while (it.hasNext() == true) {
        buffer.append((String)it.next());
        buffer.append("+");
      }
      buffer.deleteCharAt(buffer.length() - 1);
      return buffer.toString();
    }
}
