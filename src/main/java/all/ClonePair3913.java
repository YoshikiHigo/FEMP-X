package all;

import java.util.Properties;

public class ClonePair3913 {

    double method1(Properties props,String key,double value){
      String strVal=props.getProperty(key);
      if (strVal == null)   return value;
      return Double.parseDouble(strVal);
    }

    double method2(Properties p,String key,double def){
      String val=p.getProperty(key);
      if (val == null) {
        return def;
      }
     else {
        return Double.parseDouble(val);
      }
    }
}
