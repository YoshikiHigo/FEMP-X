package all;

import java.util.*;

public class ClonePair6651 {

    String method1(Map map,String key,String defaultValue){
      String result=(String)map.get(key);
      if (result == null || result.trim().length() == 0)   result=defaultValue;
      return result;
    }

    String method2(Map args,String name,String defValue){
      String result=(String)args.get(name);
      if (result == null)   return defValue;
      return result;
    }
}
