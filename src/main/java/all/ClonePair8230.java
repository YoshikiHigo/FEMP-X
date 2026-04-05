package all;

public class ClonePair8230 {

    boolean method1(Object o){
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
