package all;

import java.util.*;

public class ClonePair6656 {

    String method1(Map param,String key,String def){
      String value=(String)param.get(key);
      if (value == null || value.length() == 0)   return def;
      return value;
    }

    String method2(Map args,String name,String defValue){
      String result=(String)args.get(name);
      if (result == null)   return defValue;
      return result;
    }
}
