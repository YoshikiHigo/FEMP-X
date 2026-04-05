package unverified;

import java.util.*;

public class ClonePair4968 {

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

    int method2(Properties prop,String name,int defaultValue){
      String v=prop.getProperty(name);
      if (v == null)   return defaultValue;
      return Integer.parseInt(v);
    }
}
