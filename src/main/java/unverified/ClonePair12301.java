package unverified;

import java.util.Collection;
import java.util.Iterator;

public class ClonePair12301 {

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

    String method2(Collection collection,String delimiter){
      if (collection.size() == 0)   return "";
      String tmp="";
      for (  Object o : collection) {
        tmp+=o + delimiter;
      }
      return tmp.substring(0,tmp.length() - delimiter.length());
    }
}
