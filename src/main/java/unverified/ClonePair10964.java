package unverified;

import java.util.Properties;

public class ClonePair10964 {

    Double method1(Properties props,String key,Double def){
      String value=props.getProperty(key);
      if (value != null)   return Double.parseDouble(value);
      value=props.getProperty(key + ".Min");
      if (value == null)   return def;
      if (def == null)   return Double.parseDouble(value);
      return Math.max(Double.parseDouble(value),def);
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
