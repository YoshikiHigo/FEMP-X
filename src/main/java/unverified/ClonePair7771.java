package unverified;

public class ClonePair7771 {

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

    boolean method2(Object a,Object b){
      if (a == null) {
        return b == null;
      }
     else {
        return b != null && a.equals(b);
      }
    }
}
