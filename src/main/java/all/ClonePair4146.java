package all;

import java.util.Iterator;
import java.util.List;

public class ClonePair4146 {

    String[] method1(List list){
      String[] array=new String[list.size()];
      for (int i=0; i < list.size(); i++)   array[i]=(String)list.get(i);
      return array;
    }

    String[] method2(List list){
      String[] result=new String[list.size()];
      int i=0;
      for (Iterator it=list.iterator(); it.hasNext(); i++)   result[i]=(String)it.next();
      return result;
    }
}
