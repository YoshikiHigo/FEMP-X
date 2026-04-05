package unverified;

import java.util.Iterator;
import java.util.List;

public class ClonePair4140 {

    String[] method1(List list){
      String[] array=new String[list.size()];
      for (int i=0; i < list.size(); i++) {
        array[i]=(String)list.get(i);
      }
      return array;
    }

    String[] method2(List resourcesAsStrings){
      int len=resourcesAsStrings.size();
      String[] res=new String[len];
      int i=0;
      for (Iterator iterator=resourcesAsStrings.iterator(); iterator.hasNext(); ) {
        String s=(String)iterator.next();
        res[i]=s;
        i++;
      }
      return res;
    }
}
