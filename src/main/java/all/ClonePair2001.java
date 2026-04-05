package all;

import java.util.Iterator;
import java.util.List;

public class ClonePair2001 {

    String method1(List tokens){
      StringBuffer buffer=new StringBuffer();
      Iterator itr=tokens.iterator();
      while (itr.hasNext()) {
        buffer.append(itr.next());
      }
      return buffer.toString();
    }

    String method2(List objects){
      StringBuffer result=new StringBuffer();
      for (int i=0; i < objects.size(); i++) {
        result.append(objects.get(i)).append(' ');
      }
      return result.toString();
    }
}
