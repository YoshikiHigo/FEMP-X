package unverified;

import java.util.Iterator;
import java.util.List;

public class ClonePair4215 {

    boolean method1(List arr,String estadoExp){
      boolean encontro=false;
      for (int i=0; i < arr.size(); i++) {
        if (((String)arr.get(i)).equals(estadoExp)) {
          encontro=true;
          break;
        }
      }
      return encontro;
    }

    boolean method2(List l,String name){
      for (Iterator i=l.iterator(); i.hasNext(); ) {
        String group=(String)i.next();
        if (group.equals(name))     return true;
      }
      return false;
    }
}
