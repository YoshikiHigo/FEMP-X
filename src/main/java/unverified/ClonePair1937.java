package unverified;

import java.util.Iterator;
import java.util.List;

public class ClonePair1937 {

    String method1(List setList){
      StringBuffer sb=new StringBuffer();
      if (setList.size() > 0) {
        sb.append((String)setList.get(0));
      }
      for (int i=1; i < setList.size(); i++) {
        sb.append(",");
        sb.append((String)setList.get(i));
      }
      return sb.toString();
    }

    String method2(List list){
      String sep="";
      String ret="";
      Iterator it=list.iterator();
      while (it.hasNext()) {
        ret+=(sep + (String)it.next());
        sep=",";
      }
      return ret;
    }
}
