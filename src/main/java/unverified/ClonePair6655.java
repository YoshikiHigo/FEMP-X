package unverified;

import java.util.*;

public class ClonePair6655 {

    String method1(Map config,String key,String defaultValue){
      Object object=config.get(key);
      if (object == null) {
        return defaultValue;
      }
      return (String)object;
    }

    String method2(Map controlTable,String fieldName,String defaultValue){
      if (controlTable.containsKey(fieldName))   return (String)controlTable.get(fieldName);
     else   return defaultValue;
    }
}
