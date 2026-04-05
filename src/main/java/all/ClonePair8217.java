package all;

import java.util.*;

public class ClonePair8217 {

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
