package all;

import java.util.*;

public class ClonePair5224 {

    String method1(Properties p,String prop_name,String def_value){
      String val=p.getProperty(prop_name);
      if (val == null) {
        return def_value;
      }
      return val;
    }

    String method2(Properties props,String key,String defval){
      String val=props.getProperty(key);
      if (val == null)   return defval;
      return val.trim();
    }
}
