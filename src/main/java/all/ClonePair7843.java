package all;

public class ClonePair7843 {

    boolean method1(Object obj1,Object obj2){
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

    boolean method2(Object object1,Object object2){
      if (object1 == null)   return (object2 == null);
     else   if (object2 == null)   return false;
     else   if (object1 == object2)   return true;
      return object1.equals(object2);
    }
}
