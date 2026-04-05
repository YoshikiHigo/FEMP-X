package unverified;

import java.util.*;

public class ClonePair7653 {

    boolean method1(Object objA,Object objB){
      if (objA == objB)   return true;
      if (objA == null && objB != null)   return false;
      if (objA != null && objB == null)   return false;
      if (objA.getClass() != objB.getClass())   return false;
      return objA.equals(objB);
    }

    boolean method2(Object value1,Object value2){
      if (value1 == value2)   return true;
     else   if (value1 == null || value2 == null)   return false;
     else   if (value1.getClass() != value2.getClass())   return false;
     else   if (value1 instanceof byte[])   return Arrays.equals((byte[])value1,(byte[])value2);
     else   return value1.equals(value2);
    }
}
