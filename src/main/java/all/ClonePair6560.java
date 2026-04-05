package all;

import java.util.*;

public class ClonePair6560 {

    String method1(Map<String,String[]> params,String key){
      String[] values=params.get(key);
      if (values == null || values.length == 0) {
        return null;
      }
      return values[0];
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
