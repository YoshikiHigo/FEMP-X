package all;

import java.util.*;

public class ClonePair8769 {

    boolean method1(ArrayList col,int o){
      for (int i=0; i < col.size(); i++) {
        Integer it=(Integer)col.get(i);
        if (it.intValue() == o)     return true;
      }
      return false;
    }

    boolean method2(ArrayList cs,int x){
      Integer c;
      for (int i=0; i < cs.size(); i++) {
        c=(Integer)cs.get(i);
        if (c.intValue() == x) {
          return true;
        }
      }
      return false;
    }
}
