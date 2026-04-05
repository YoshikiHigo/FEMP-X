package all;

import java.util.Iterator;
import java.util.List;

public class ClonePair4136 {

    String[] method1(List noteListJAXB){
      String[] note=new String[noteListJAXB.size()];
      int c=0;
      for (Iterator k=noteListJAXB.iterator(); k.hasNext(); ) {
        note[c]=(String)k.next();
      }
      return note;
    }

    String[] method2(List list){
      String[] array=new String[list.size()];
      for (int i=0; i < list.size(); i++) {
        array[i]=(String)list.get(i);
      }
      return array;
    }
}
