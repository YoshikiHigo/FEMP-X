package all;

import java.util.*;

public class ClonePair4972 {

    int method1(Properties settings,String name,int i){
      String v=settings.getProperty(name);
      if (v == null) {
        return i;
      }
      return Integer.parseInt(v);
    }

    int method2(Properties prop,String name,int defaultValue){
      String v=prop.getProperty(name);
      if (v == null)   return defaultValue;
      return Integer.parseInt(v);
    }
}
