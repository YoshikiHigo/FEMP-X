package unverified;

public class ClonePair7600 {

    boolean method1(Object t1,Object t2){
      if (t1 instanceof Number && t2 instanceof Number) {
        return ((Number)t1).doubleValue() == ((Number)t2).doubleValue();
      }
     else {
        if (t1 == null || t2 == null) {
          return false;
        }
        return t1.equals(t2);
      }
    }

    boolean method2(Object a,Object b){
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
}
