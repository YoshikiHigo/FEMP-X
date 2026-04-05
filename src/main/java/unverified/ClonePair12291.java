package unverified;

import java.util.Collection;
import java.util.Iterator;

public class ClonePair12291 {

    String method1(Collection s,String delimiter){
      StringBuffer buffer=new StringBuffer();
      Iterator iter=s.iterator();
      while (iter.hasNext()) {
        buffer.append(iter.next());
        if (iter.hasNext()) {
          buffer.append(delimiter);
        }
      }
      return buffer.toString();
    }

    String method2(Collection list,String delimiter){
      StringBuffer buffer=new StringBuffer("");
      Iterator itr=list.iterator();
      while (itr.hasNext()) {
        buffer.append(itr.next());
        if (itr.hasNext()) {
          buffer.append(delimiter == null ? "," : delimiter);
        }
      }
      return buffer.toString();
    }
}
