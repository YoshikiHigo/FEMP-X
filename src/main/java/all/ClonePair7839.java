package all;

import java.util.*;

public class ClonePair7839 {

    boolean method1(Object value1,Object value2){
      if (value1 == value2)   return true;
     else   if (value1 == null || value2 == null)   return false;
     else   if (value1.getClass() != value2.getClass())   return false;
     else   if (value1 instanceof byte[])   return Arrays.equals((byte[])value1,(byte[])value2);
     else   return value1.equals(value2);
    }

    boolean method2(Object n1,Object n2){
      if (n1 == null || n2 == null)   return false;
      if (!(n1 instanceof Number && n2 instanceof Number)) {
        return n1.equals(n2);
      }
      return ((Number)n1).floatValue() == ((Number)n2).floatValue();
    }
}
