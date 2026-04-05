package unverified;

import java.util.*;

public class ClonePair4966 {

    int method1(Properties config,String name,int defaultVal){
      int value;
      String strValue=config.getProperty(name);
      if (strValue == null) {
        value=defaultVal;
      }
     else {
        value=Integer.parseInt(strValue.trim());
      }
      return value;
    }

    int method2(Properties settings,String name,int i){
      String v=settings.getProperty(name);
      if (v == null) {
        return i;
      }
      return Integer.parseInt(v);
    }
}
