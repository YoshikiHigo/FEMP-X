package all;

import java.util.List;

public class ClonePair2006 {

    String method1(List list){
      StringBuffer strBuf=new StringBuffer();
      int size=list.size();
      for (int i=0; i < size; i++) {
        strBuf.append((i > 0 ? "," : "") + list.get(i));
      }
      return strBuf.toString();
    }

    String method2(List list){
      StringBuffer buffer=new StringBuffer();
      for (int i=0; i < list.size(); i++) {
        buffer.append((i + 1) + "=" + list.get(i)).append("\n");
      }
      return buffer.toString();
    }
}
