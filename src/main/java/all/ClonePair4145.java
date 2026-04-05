package all;

import java.util.List;

public class ClonePair4145 {

    String[] method1(List list){
      if (list == null) {
        return null;
      }
      String[] result=new String[list.size()];
      for (int i=0; i < list.size(); i++) {
        result[i]=(String)list.get(i);
      }
      return result;
    }

    String[] method2(List list){
      if (list == null) {
        return (null);
      }
      String[] result=new String[list.size()];
      for (int i=0; i < list.size(); i++) {
        try {
          result[i]=(String)list.get(i);
        }
     catch (    ClassCastException ce) {
          result[i]=((Integer)list.get(i)).toString();
        }
      }
      return (result);
    }
}
