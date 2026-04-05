package all;

public class ClonePair7314 {

    boolean method1(Object obj1,Object obj2){
      if (obj1 == obj2) {
        return true;
      }
      if ((obj1 == null && obj2 != null) || (obj2 == null && obj1 != null) || (obj1.getClass() != obj2.getClass())) {
        return false;
      }
      return obj1.equals(obj2);
    }

    boolean method2(Object obj1,Object obj2){
      if ((obj1 != null) || (obj2 != null))   if ((obj1 != null) && (obj2 != null)) {
        if (!obj1.equals(obj2))     return false;
      }
     else   if ((obj1 != null) || (obj2 != null))   return false;
      return true;
    }
}
