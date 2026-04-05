package unverified;

import java.util.*;

public class ClonePair4973 {

    int method1(Properties attribs,String name,int def){
      String value=attribs.getProperty(name);
      if (value == null) {
        return def;
      }
     else {
        return Integer.parseInt(value);
      }
    }

    int method2(Properties prop,String name,int defaultValue){
      String v=prop.getProperty(name);
      if (v == null)   return defaultValue;
      return Integer.parseInt(v);
    }
}
