package all;

import java.util.*;

public class ClonePair6657 {

    String method1(Map config,String key,String defaultValue){
      Object object=config.get(key);
      if (object == null) {
        return defaultValue;
      }
      return (String)object;
    }

    String method2(Map args,String name,String defValue){
      String result=(String)args.get(name);
      if (result == null)   return defValue;
      return result;
    }
}
