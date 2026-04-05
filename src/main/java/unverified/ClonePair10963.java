package unverified;

import java.util.Properties;

public class ClonePair10963 {

    Double method1(Properties props,String key,Double defaultValue){
      String p=props.getProperty(key,(defaultValue == null) ? null : String.valueOf(defaultValue));
      if (p == null)   return null;
      return Double.valueOf(p);
    }

    Double method2(Properties props,String key,Double def){
      String value=props.getProperty(key);
      if (value != null)   return Double.parseDouble(value);
      value=props.getProperty(key + ".Max");
      if (value == null)   return def;
      if (def == null)   return Double.parseDouble(value);
      return Math.min(Double.parseDouble(value),def);
    }
}
