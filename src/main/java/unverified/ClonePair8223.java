package unverified;

import java.util.*;

public class ClonePair8223 {

    boolean method1(Object v){
      if (null == v) {
        return false;
      }
     else   if (v instanceof String) {
        return ((String)v).length() > 0;
      }
     else   if (v instanceof Number) {
        return ((Number)v).longValue() != 0;
      }
     else {
        return v.toString().length() > 0;
      }
    }

    boolean method2(Object object){
      if (object == null)   return false;
      if (object instanceof Boolean)   return (Boolean)object;
      if (object instanceof Number)   return !Double.valueOf(((Number)object).doubleValue()).equals(new Double(0.0));
      if (object instanceof String)   return ((String)object).length() != 0;
      if (object instanceof List)   return ((List)object).size() != 0;
      if (object instanceof Map)   return ((Map)object).size() != 0;
      return true;
    }
}
