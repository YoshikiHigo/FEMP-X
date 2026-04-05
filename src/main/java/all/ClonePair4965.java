package all;

import java.util.*;

public class ClonePair4965 {

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

    int method2(Properties attribs,String name,int def){
      String value=attribs.getProperty(name);
      if (value == null) {
        return def;
      }
     else {
        return Integer.parseInt(value);
      }
    }
}
