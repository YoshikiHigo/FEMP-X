package unverified;

import java.util.*;

public class ClonePair4969 {

    int method1(Properties attribs,String name,int def){
      String value=attribs.getProperty(name);
      if (value == null) {
        return def;
      }
     else {
        return Integer.parseInt(value);
      }
    }

    int method2(Properties settings,String name,int i){
      String v=settings.getProperty(name);
      if (v == null) {
        return i;
      }
      return Integer.parseInt(v);
    }
}
