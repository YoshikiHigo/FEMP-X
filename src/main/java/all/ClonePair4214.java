package all;

import java.util.Iterator;
import java.util.List;

public class ClonePair4214 {

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

    boolean method2(List outputDataStrings,String accessorName){
      for (Iterator iterator=outputDataStrings.iterator(); iterator.hasNext(); ) {
        String data=(String)iterator.next();
        if (data.equalsIgnoreCase(accessorName)) {
          return true;
        }
      }
      return false;
    }
}
