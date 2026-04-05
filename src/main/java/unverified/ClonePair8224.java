package unverified;

public class ClonePair8224 {

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

    boolean method2(Object o){
      if (o == null)   return false;
      if (o instanceof Boolean)   return ((Boolean)o).booleanValue();
      if (o instanceof Long)   return ((Long)o).longValue() != 0;
      if (o instanceof Integer)   return ((Integer)o).intValue() != 0;
      if (o instanceof Number) {
        double d=((Number)o).doubleValue();
        return d != 0.0 && d == d;
      }
      if (o instanceof String)   return ((String)o).length() != 0;
      return true;
    }
}
