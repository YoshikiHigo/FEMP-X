package all;

import java.util.*;

public class ClonePair7780 {

    boolean method1(Object a,Object b){
      if (a == b)   return true;
      if (a == null || b == null)   return false;
      if (a instanceof Number && b instanceof Number) {
        Number aa=(Number)a;
        Number bb=(Number)b;
        double diff=Math.abs(aa.doubleValue() - bb.doubleValue());
        return diff < 0.00001;
      }
      return a.equals(b);
    }

    boolean method2(Object value1,Object value2){
      if (value1 == value2)   return true;
     else   if (value1 == null || value2 == null)   return false;
     else   if (value1.getClass() != value2.getClass())   return false;
     else   if (value1 instanceof byte[])   return Arrays.equals((byte[])value1,(byte[])value2);
     else   return value1.equals(value2);
    }
}
