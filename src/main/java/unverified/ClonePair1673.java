package unverified;

import java.util.Iterator;
import java.util.List;

public class ClonePair1673 {

    String method1(List data){
      StringBuffer sb=new StringBuffer();
      final String SEP="\t";
      for (int i=0; i < data.size(); i++) {
        if (i != 0)     sb.append(SEP);
        sb.append(data.get(i));
      }
      return sb.toString();
    }

    String method2(List list){
      StringBuffer b=new StringBuffer();
      for (Iterator i=list.iterator(); i.hasNext(); ) {
        b.append(i.next());
        if (i.hasNext()) {
          b.append(", ");
        }
      }
      return b.toString();
    }
}
