package all;

import java.util.*;

public class ClonePair6658 {

    String method1(Map controlTable,String fieldName,String defaultValue){
      if (controlTable.containsKey(fieldName))   return (String)controlTable.get(fieldName);
     else   return defaultValue;
    }

    String method2(Map args,String name,String defValue){
      String result=(String)args.get(name);
      if (result == null)   return defValue;
      return result;
    }
}
