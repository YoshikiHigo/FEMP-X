package all;

import java.util.*;

public class ClonePair8218 {

    boolean method1(Object test){
      if (test != null) {
        if (test instanceof Boolean) {
          return ((Boolean)test).booleanValue();
        }
     else     if (test instanceof String) {
          return ((String)test).length() > 0;
        }
     else     if (test instanceof Number) {
          return ((Number)test).intValue() != 0;
        }
     else     if (test instanceof Collection) {
          return !((Collection)test).isEmpty();
        }
     else {
          return true;
        }
      }
      return false;
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
