package all;

import java.util.*;

public class ClonePair68 {

    LinkedHashMap method1(HashMap passedMap,boolean ascending){
      List mapKeys=new ArrayList(passedMap.keySet());
      List mapValues=new ArrayList(passedMap.values());
      Collections.sort(mapValues);
      Collections.sort(mapKeys);
      if (!ascending) {
        Collections.reverse(mapValues);
      }
      LinkedHashMap someMap=new LinkedHashMap();
      Iterator valueIt=mapValues.iterator();
      while (valueIt.hasNext()) {
        Object val=valueIt.next();
        Iterator keyIt=mapKeys.iterator();
        while (keyIt.hasNext()) {
          Object key=keyIt.next();
          if (passedMap.get(key).toString().equals(val.toString())) {
            passedMap.remove(key);
            mapKeys.remove(key);
            someMap.put(key,val);
            break;
          }
        }
      }
      return someMap;
    }

    LinkedHashMap method2(HashMap passedMap,boolean ascending){
      List mapKeys=new ArrayList(passedMap.keySet());
      List mapValues=new ArrayList(passedMap.values());
      Collections.sort(mapValues);
      Collections.sort(mapKeys);
      if (!ascending)   Collections.reverse(mapValues);
      LinkedHashMap someMap=new LinkedHashMap();
      Iterator valueIt=mapValues.iterator();
      while (valueIt.hasNext()) {
        Object val=valueIt.next();
        Iterator keyIt=mapKeys.iterator();
        while (keyIt.hasNext()) {
          Object key=keyIt.next();
          if (passedMap.get(key).toString().equals(val.toString())) {
            passedMap.remove(key);
            mapKeys.remove(key);
            someMap.put(key,val);
            break;
          }
        }
      }
      return someMap;
    }
}
