package unverified;

public class ClonePair7357 {

    boolean method1(Object value1,Object value2){
      if (value1 == value2)   return true;
     else   if (value1 == null || value2 == null)   return false;
     else   if (value1.getClass() == value2.getClass())   return value1.equals(value2);
     else   return false;
    }

    boolean method2(Object obj1,Object obj2){
      if ((obj1 != null) || (obj2 != null))   if ((obj1 != null) && (obj2 != null)) {
        if (!obj1.equals(obj2))     return false;
      }
     else   if ((obj1 != null) || (obj2 != null))   return false;
      return true;
    }
}
