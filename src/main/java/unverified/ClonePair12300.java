package unverified;

import java.util.Collection;
import java.util.Iterator;

public class ClonePair12300 {

    String method1(Collection objects,String separator){
      if (objects.isEmpty())   return "";
      Iterator iter=objects.iterator();
      StringBuffer list=new StringBuffer();
      list.append(iter.next());
      while (iter.hasNext()) {
        list.append(separator);
        list.append(iter.next());
      }
      return list.toString();
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
