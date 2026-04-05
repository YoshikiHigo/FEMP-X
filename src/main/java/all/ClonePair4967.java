package all;

import java.util.*;

public class ClonePair4967 {

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

    int method2(Properties params,String paramName,int defaultValue){
      int integerResult=defaultValue;
      String widthParam=params.getProperty(paramName);
      if (widthParam != null) {
        integerResult=Integer.valueOf(widthParam);
      }
      return integerResult;
    }
}
