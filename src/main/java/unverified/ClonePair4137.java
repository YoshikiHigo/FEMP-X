package unverified;

import java.util.Iterator;
import java.util.List;

public class ClonePair4137 {

    String[] method1(List noteListJAXB){
      String[] note=new String[noteListJAXB.size()];
      int c=0;
      for (Iterator k=noteListJAXB.iterator(); k.hasNext(); ) {
        note[c]=(String)k.next();
      }
      return note;
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
