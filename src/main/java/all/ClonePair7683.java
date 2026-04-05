package all;

import java.util.*;

public class ClonePair7683 {

    boolean method1(Object value1,Object value2){
      if (value1 == null) {
        return value2 == null;
      }
     else   if (value2 == null) {
        return false;
      }
      if (value1.getClass() != value2.getClass()) {
        return false;
      }
      return value1.equals(value2);
    }

    boolean method2(Object value1,Object value2){
      if (value1 == value2)   return true;
     else   if (value1 == null || value2 == null)   return false;
     else   if (value1.getClass() != value2.getClass())   return false;
     else   if (value1 instanceof byte[])   return Arrays.equals((byte[])value1,(byte[])value2);
     else   return value1.equals(value2);
    }
}
