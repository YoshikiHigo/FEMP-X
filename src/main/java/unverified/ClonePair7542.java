package unverified;

public class ClonePair7542 {

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

    boolean method2(Object left,Object right){
      if (left == null && right == null) {
        return true;
      }
      if (left == null || right == null) {
        return false;
      }
      if (left.getClass().getCanonicalName().equals(right.getClass().getCanonicalName())) {
        return left.equals(right);
      }
      return left.toString().equals(right.toString());
    }
}
