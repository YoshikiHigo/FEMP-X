package unverified;

public class ClonePair7595 {

    boolean method1(Object left,Object right){
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

    boolean method2(Object actExc,Object expExc){
      if (expExc == null) {
        return actExc == null;
      }
     else {
        return actExc != null && expExc.getClass() == actExc.getClass();
      }
    }
}
