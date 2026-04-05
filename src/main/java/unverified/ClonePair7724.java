package unverified;

public class ClonePair7724 {

    boolean method1(Object obj1,Object obj2){
      if ((obj1 != null) || (obj2 != null))   if ((obj1 != null) && (obj2 != null)) {
        if (!obj1.equals(obj2))     return false;
      }
     else   if ((obj1 != null) || (obj2 != null))   return false;
      return true;
    }

    boolean method2(Object o1,Object o2){
      if (o1 == null) {
        if (o2 != null) {
          return false;
        }
      }
     else   if (o2 == null) {
        return false;
      }
     else   if (!o1.equals(o2)) {
        return false;
      }
      return true;
    }
}
