package unverified;

public class ClonePair7581 {

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

    boolean method2(Object objA,Object objB){
      if (objA == objB)   return true;
      if (objA == null && objB != null)   return false;
      if (objA != null && objB == null)   return false;
      if (objA.getClass() != objB.getClass())   return false;
      return objA.equals(objB);
    }
}
