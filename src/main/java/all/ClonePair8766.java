package all;

import java.util.*;

public class ClonePair8766 {

    int method1(List list,Object o){
      if (list instanceof ArrayList) {
        int ln=list.size();
        int i=0;
        while (i < ln) {
          if (list.get(i) == o) {
            return i;
          }
          i++;
        }
        return -1;
      }
     else {
        int i=0;
        Iterator it=list.iterator();
        while (it.hasNext()) {
          if (it.next() == o) {
            return i;
          }
          i++;
        }
        return -1;
      }
    }

    int method2(List list,Object obj){
      for (int i=0; i < list.size(); i++) {
        if (list.get(i) == obj) {
          return i;
        }
      }
      return -1;
    }
}
