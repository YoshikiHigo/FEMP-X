package all;

import java.util.Collection;
import java.util.Iterator;

public class ClonePair12302 {

    String method1(Collection list,String delimiter){
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

    String method2(Collection collection,String separator){
      StringBuffer string=new StringBuffer(128);
      Iterator it=collection.iterator();
      while (it.hasNext()) {
        string.append(it.next());
        if (it.hasNext()) {
          string.append(separator);
        }
      }
      return string.toString();
    }
}
