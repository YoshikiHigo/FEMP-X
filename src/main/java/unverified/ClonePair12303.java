package unverified;

import java.util.Collection;
import java.util.Iterator;

public class ClonePair12303 {

    String method1(Collection collection,String separator){
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

    String method2(Collection collection,String delimiter){
      if (collection.size() == 0)   return "";
      String tmp="";
      for (  Object o : collection) {
        tmp+=o + delimiter;
      }
      return tmp.substring(0,tmp.length() - delimiter.length());
    }
}
