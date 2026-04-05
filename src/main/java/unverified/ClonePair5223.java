package unverified;

import java.util.*;

public class ClonePair5223 {

    String method1(Properties p,String prop_name,String def_value){
      String val=p.getProperty(prop_name);
      if (val == null) {
        return def_value;
      }
      return val;
    }

    String method2(Properties config,String name,String defaultVal){
      String value=config.getProperty(name);
      if (value == null) {
        return defaultVal;
      }
      return value.trim();
    }
}
