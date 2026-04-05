package all;

import java.util.List;

public class ClonePair1736 {

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

    String method2(List setList){
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
}
