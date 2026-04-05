package unverified;

import java.util.*;

public class ClonePair8219 {

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
