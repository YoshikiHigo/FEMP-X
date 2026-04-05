package all;

import java.util.*;

public class ClonePair6653 {

    String method1(Map param,String key,String def){
      String value=(String)param.get(key);
      if (value == null || value.length() == 0)   return def;
      return value;
    }

    String method2(Map config,String key,String defaultValue){
      Object object=config.get(key);
      if (object == null) {
        return defaultValue;
      }
      return (String)object;
    }
}
