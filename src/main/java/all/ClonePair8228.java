package all;

import java.util.*;

public class ClonePair8228 {

    boolean method1(Object object){
      if (object == null)   return false;
      if (object instanceof Boolean)   return (Boolean)object;
      if (object instanceof Number)   return !Double.valueOf(((Number)object).doubleValue()).equals(new Double(0.0));
      if (object instanceof String)   return ((String)object).length() != 0;
      if (object instanceof List)   return ((List)object).size() != 0;
      if (object instanceof Map)   return ((Map)object).size() != 0;
      return true;
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
