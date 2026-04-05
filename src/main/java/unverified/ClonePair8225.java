package unverified;

public class ClonePair8225 {

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

    boolean method2(Object obj){
      if (obj instanceof String) {
        String s=(String)obj;
        if (s.isEmpty())     return false;
      }
     else {
        if (obj instanceof Number) {
          Number n=(Number)obj;
          if (n.doubleValue() == 0)       return false;
        }
     else {
          if (obj == null)       return false;
        }
      }
      return true;
    }
}
