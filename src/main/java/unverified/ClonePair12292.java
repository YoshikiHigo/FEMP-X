package unverified;

import java.util.Collection;
import java.util.Iterator;

public class ClonePair12292 {

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
