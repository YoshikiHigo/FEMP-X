package unverified;

import java.util.Iterator;
import java.util.List;

public class ClonePair4139 {

    String[] method1(List noteListJAXB){
      String[] note=new String[noteListJAXB.size()];
      int c=0;
      for (Iterator k=noteListJAXB.iterator(); k.hasNext(); ) {
        note[c]=(String)k.next();
      }
      return note;
    }

    String[] method2(List list){
      String[] result=new String[list.size()];
      int i=0;
      for (Iterator it=list.iterator(); it.hasNext(); i++)   result[i]=(String)it.next();
      return result;
    }
}
