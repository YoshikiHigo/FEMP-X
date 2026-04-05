package all;

import java.util.*;

public class ClonePair5231 {

    String method1(Properties props,String key,String defval){
      String val=props.getProperty(key);
      if (val == null)   return defval;
      return val.trim();
    }

    String method2(Properties config,String name,String defaultVal){
      String value=config.getProperty(name);
      if (value == null) {
        value=defaultVal;
      }
      return value;
    }
}
