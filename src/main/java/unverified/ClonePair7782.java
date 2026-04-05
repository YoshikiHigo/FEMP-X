package unverified;

public class ClonePair7782 {

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

    boolean method2(Object n1,Object n2){
      if (n1 == null || n2 == null)   return false;
      if (!(n1 instanceof Number && n2 instanceof Number)) {
        return n1.equals(n2);
      }
      return ((Number)n1).floatValue() == ((Number)n2).floatValue();
    }
}
