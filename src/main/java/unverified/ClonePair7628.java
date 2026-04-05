package unverified;

public class ClonePair7628 {

    boolean method1(Object o1,Object o2){
      if (o1 == null && o2 == null)   return true;
      if (o1 == null || o2 == null)   return false;
      if (o1.equals(o2))   return true;
     else   return false;
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
