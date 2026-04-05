package unverified;

public class ClonePair7728 {

    boolean method1(Object obj1,Object obj2){
      if ((obj1 != null) || (obj2 != null))   if ((obj1 != null) && (obj2 != null)) {
        if (!obj1.equals(obj2))     return false;
      }
     else   if ((obj1 != null) || (obj2 != null))   return false;
      return true;
    }

    boolean method2(Object value,Object target){
      if ((value == null) && (target == null)) {
        return true;
      }
     else   if ((value == null) || (target == null)) {
        return false;
      }
     else   if (value.equals(target)) {
        return true;
      }
     else {
        return value.toString().equals(target.toString());
      }
    }
}
