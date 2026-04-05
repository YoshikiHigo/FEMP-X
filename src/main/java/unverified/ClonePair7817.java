package unverified;

public class ClonePair7817 {

    boolean method1(Object a,Object b){
      if (a == null) {
        return b == null;
      }
     else {
        return b != null && a.equals(b);
      }
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
