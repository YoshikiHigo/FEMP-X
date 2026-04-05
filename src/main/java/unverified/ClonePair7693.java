package unverified;

public class ClonePair7693 {

    boolean method1(Object o1,Object o2){
      if (o1 == null) {
        return o2 == null;
      }
      return o2 != null && (o1 == o2 || o1.getClass() == o2.getClass() && o1.hashCode() == o2.hashCode());
    }

    boolean method2(Object obj1,Object obj2){
      if ((obj1 != null) || (obj2 != null))   if ((obj1 != null) && (obj2 != null)) {
        if (!obj1.equals(obj2))     return false;
      }
     else   if ((obj1 != null) || (obj2 != null))   return false;
      return true;
    }
}
