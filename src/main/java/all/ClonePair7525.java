package all;

public class ClonePair7525 {

    boolean method1(Object obj1,Object obj2){
      if ((obj1 == null && obj2 != null) || (obj2 == null && obj1 != null))   return false;
      if (obj1 == null && obj2 == null)   return true;
      if (obj1.equals(obj2))   return true;
     else   return false;
    }

    boolean method2(Object obj1,Object obj2){
      if (obj1 == null && obj2 == null) {
        return true;
      }
      if (obj1 != null && obj2 != null) {
        if (obj1.getClass().isInstance(obj2)) {
          if (obj1.equals(obj2)) {
            return true;
          }
        }
      }
      return false;
    }
}
