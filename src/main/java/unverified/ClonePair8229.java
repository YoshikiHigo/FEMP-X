package unverified;

import java.util.*;

public class ClonePair8229 {

    boolean method1(Object object){
      if (object == null)   return false;
      if (object instanceof Boolean)   return (Boolean)object;
      if (object instanceof Number)   return !Double.valueOf(((Number)object).doubleValue()).equals(new Double(0.0));
      if (object instanceof String)   return ((String)object).length() != 0;
      if (object instanceof List)   return ((List)object).size() != 0;
      if (object instanceof Map)   return ((Map)object).size() != 0;
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
