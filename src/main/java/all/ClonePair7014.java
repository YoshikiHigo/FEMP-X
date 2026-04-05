package all;

import java.util.*;

public class ClonePair7014 {

    Map method1(List list){
      Map indexes=new HashMap();
      int index=0;
      for (Iterator it=list.iterator(); it.hasNext(); ) {
        indexes.put(it.next(),new Integer(index++));
      }
      return indexes;
    }

    Map method2(List l){
      Map m=new HashMap(l.size());
      for (int i=0; i < l.size(); i++) {
        m.put(l.get(i),new Integer(i));
      }
      return m;
    }
}
