package all;

import java.util.*;

public class ClonePair5783 {

    String method1(Map<String,String> args,String name,String defl){
      String s=args.get(name);
      if (s == null) {
        return defl;
      }
     else {
        return s;
      }
    }

    String method2(Map<String,String> attrs,String name,String def){
      String val=attrs.get(name);
      if (val == null) {
        val=def;
      }
      return val;
    }
}
