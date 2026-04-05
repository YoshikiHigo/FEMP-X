package unverified;

import java.util.*;

public class ClonePair7833 {

    boolean method1(Object obj1,Object obj2){
      if (obj1 == null)   return (obj2 == null);
      return ((obj2 != null) && obj1.equals(obj2));
    }

    boolean method2(Object value1,Object value2){
      if (value1 == value2)   return true;
     else   if (value1 == null || value2 == null)   return false;
     else   if (value1.getClass() != value2.getClass())   return false;
     else   if (value1 instanceof byte[])   return Arrays.equals((byte[])value1,(byte[])value2);
     else   return value1.equals(value2);
    }
}
