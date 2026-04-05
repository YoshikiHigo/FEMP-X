package unverified;

import java.util.*;

public class ClonePair6561 {

    String method1(Map<String,String[]> params,String key){
      String[] values=params.get(key);
      if (values == null || values.length == 0) {
        return null;
      }
      return values[0];
    }

    String method2(Map<String,String[]> parameterMap,String parameterKey){
      String[] parameterKeyValues=(String[])parameterMap.get(parameterKey);
      if (null == parameterKeyValues || parameterKeyValues.length == 0) {
        return null;
      }
      return parameterKeyValues[0];
    }
}
