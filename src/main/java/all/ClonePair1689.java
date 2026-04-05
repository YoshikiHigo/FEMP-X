package all;

import java.util.List;

public class ClonePair1689 {

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
      StringBuffer strBuf=new StringBuffer();
      int size=list.size();
      for (int i=0; i < size; i++) {
        strBuf.append((i > 0 ? "," : "") + list.get(i));
      }
      return strBuf.toString();
    }
}
