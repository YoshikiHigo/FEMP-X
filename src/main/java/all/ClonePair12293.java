package all;

import java.util.Collection;
import java.util.Iterator;

public class ClonePair12293 {

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

    String method2(Collection collection,String delimiter){
      if (collection.size() == 0)   return "";
      String tmp="";
      for (  Object o : collection) {
        tmp+=o + delimiter;
      }
      return tmp.substring(0,tmp.length() - delimiter.length());
    }
}
