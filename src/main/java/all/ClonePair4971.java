package all;

import java.util.*;

public class ClonePair4971 {

    int method1(Properties settings,String name,int i){
      String v=settings.getProperty(name);
      if (v == null) {
        return i;
      }
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
