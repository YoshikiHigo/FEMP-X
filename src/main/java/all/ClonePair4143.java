package all;

import java.util.Iterator;
import java.util.List;

public class ClonePair4143 {

    String[] method1(List resourcesAsStrings){
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

    String[] method2(List list){
      String[] result=new String[list.size()];
      int i=0;
      for (Iterator it=list.iterator(); it.hasNext(); i++)   result[i]=(String)it.next();
      return result;
    }
}
