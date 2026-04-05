package unverified;

import java.util.*;

public class ClonePair6652 {

    String method1(Map map,String key,String defaultValue){
      String result=(String)map.get(key);
      if (result == null || result.trim().length() == 0)   result=defaultValue;
      return result;
    }

    String method2(Map param,String key,String def){
      String value=(String)param.get(key);
      if (value == null || value.length() == 0)   return def;
      return value;
    }
}
