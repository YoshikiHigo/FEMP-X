package unverified;

import java.util.Collection;
import java.util.Iterator;

public class ClonePair12299 {

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
