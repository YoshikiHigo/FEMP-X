package unverified;

import java.util.*;

public class ClonePair4974 {

    int method1(Properties prop,String name,int defaultValue){
      String v=prop.getProperty(name);
      if (v == null)   return defaultValue;
      return Integer.parseInt(v);
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
