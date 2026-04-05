package all;

import java.util.*;

public class ClonePair5225 {

    String method1(Properties config,String name,String defaultVal){
      String value=config.getProperty(name);
      if (value == null) {
        return defaultVal;
      }
      return value.trim();
    }

    String method2(Properties props,String key,String defval){
      String val=props.getProperty(key);
      if (val == null)   return defval;
      return val.trim();
    }
}
