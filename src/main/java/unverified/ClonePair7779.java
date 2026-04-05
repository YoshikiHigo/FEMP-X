package unverified;

public class ClonePair7779 {

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
