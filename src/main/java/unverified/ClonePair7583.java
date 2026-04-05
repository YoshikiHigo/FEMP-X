package unverified;

public class ClonePair7583 {

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

    boolean method2(Object o1,Object o2){
      if (o1 == null) {
        return o2 == null;
      }
      return o2 != null && (o1 == o2 || o1.getClass() == o2.getClass() && o1.hashCode() == o2.hashCode());
    }
}
