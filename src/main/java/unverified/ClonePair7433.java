package unverified;

public class ClonePair7433 {

    boolean method1(Object own,Object otherObject){
      if (own == otherObject) {
        return true;
      }
      if (otherObject == null || own == null) {
        return false;
      }
      if (own.getClass() != otherObject.getClass()) {
        return false;
      }
      return true;
    }

    boolean method2(Object left,Object right){
      if (left == right)   return true;
      if (left == null || right == null)   return false;
      return left.getClass() == right.getClass();
    }
}
