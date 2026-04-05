package unverified;

import java.util.List;

public class ClonePair4141 {

    String[] method1(List list){
      String[] array=new String[list.size()];
      for (int i=0; i < list.size(); i++) {
        array[i]=(String)list.get(i);
      }
      return array;
    }

    String[] method2(List list){
      String[] array=new String[list.size()];
      for (int i=0; i < list.size(); i++)   array[i]=(String)list.get(i);
      return array;
    }
}
