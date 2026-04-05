package unverified;

import java.util.*;

public class ClonePair6654 {

    String method1(Map param,String key,String def){
      String value=(String)param.get(key);
      if (value == null || value.length() == 0)   return def;
      return value;
    }

    String method2(Map controlTable,String fieldName,String defaultValue){
      if (controlTable.containsKey(fieldName))   return (String)controlTable.get(fieldName);
     else   return defaultValue;
    }
}
