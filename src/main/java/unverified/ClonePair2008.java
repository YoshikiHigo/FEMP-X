package unverified;

import java.util.List;

public class ClonePair2008 {

    String method1(List objects){
      StringBuffer result=new StringBuffer();
      for (int i=0; i < objects.size(); i++) {
        result.append(objects.get(i)).append(' ');
      }
      return result.toString();
    }

    String method2(List list){
      StringBuffer buffer=new StringBuffer();
      for (int i=0; i < list.size(); i++) {
        buffer.append((i + 1) + "=" + list.get(i)).append("\n");
      }
      return buffer.toString();
    }
}
