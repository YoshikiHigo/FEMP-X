package unverified;

import java.util.*;

public class ClonePair6562 {

    String method1(Map<String,String[]> parameterMap,String parameterKey){
      String[] parameterKeyValues=(String[])parameterMap.get(parameterKey);
      if (null == parameterKeyValues || parameterKeyValues.length == 0) {
        return null;
      }
      return parameterKeyValues[0];
    }

    String method2(Map<String,String[]> parms,String parm_name){
      String value;
      String[] id_array=(String[])parms.get(parm_name);
      if (id_array != null && id_array.length > 0) {
        value=id_array[0];
      }
     else {
        value=null;
      }
      return value;
    }
}
