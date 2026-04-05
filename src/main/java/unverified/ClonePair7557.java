package unverified;

public class ClonePair7557 {

    boolean method1(Object a,Object b){
      if (a == null || b == null) {
        return a == b;
      }
      if (a instanceof Double && b instanceof Double) {
        Double ad=(Double)a;
        Double bd=(Double)b;
        return ad.doubleValue() == bd.doubleValue();
      }
      return a == b;
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
