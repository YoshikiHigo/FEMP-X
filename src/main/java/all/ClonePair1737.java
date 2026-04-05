package all;

import java.util.Iterator;
import java.util.List;

public class ClonePair1737 {

    String method1(List p_InputList){
      StringBuffer l_sbResult=new StringBuffer();
      int l_iIndex=0;
      while (l_iIndex < p_InputList.size()) {
        if (l_iIndex == 0) {
          l_sbResult.append((String)p_InputList.get(l_iIndex));
        }
     else {
          l_sbResult.append(",");
          l_sbResult.append((String)p_InputList.get(l_iIndex));
        }
        l_iIndex++;
      }
      return l_sbResult.toString();
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
