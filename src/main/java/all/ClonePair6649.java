package all;

import java.util.*;

public class ClonePair6649 {

    String method1(Map map,String key,String defaultValue){
      String result=(String)map.get(key);
      if (result == null || result.trim().length() == 0)   result=defaultValue;
      return result;
    }

    String method2(Map controlTable,String fieldName,String defaultValue){
      if (controlTable.containsKey(fieldName))   return (String)controlTable.get(fieldName);
     else   return defaultValue;
    }
}
