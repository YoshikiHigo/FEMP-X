package all;

import java.util.*;

public class ClonePair8216 {

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

    boolean method2(Object v){
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
}
