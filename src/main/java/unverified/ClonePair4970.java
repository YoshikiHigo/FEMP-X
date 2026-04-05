package unverified;

import java.util.*;

public class ClonePair4970 {

    int method1(Properties attribs,String name,int def){
      String value=attribs.getProperty(name);
      if (value == null) {
        return def;
      }
     else {
        return Integer.parseInt(value);
      }
    }

    int method2(Properties params,String paramName,int defaultValue){
      int integerResult=defaultValue;
      String widthParam=params.getProperty(paramName);
      if (widthParam != null) {
        integerResult=Integer.valueOf(widthParam);
      }
      return integerResult;
    }
}
