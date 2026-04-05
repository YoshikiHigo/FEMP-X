package all;

import java.util.*;

public class ClonePair6650 {

    String method1(Map map,String key,String defaultValue){
      String result=(String)map.get(key);
      if (result == null || result.trim().length() == 0)   result=defaultValue;
      return result;
    }

    String method2(Map config,String key,String defaultValue){
      Object object=config.get(key);
      if (object == null) {
        return defaultValue;
      }
      return (String)object;
    }
}
