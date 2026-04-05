package all;

public class ClonePair7431 {

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

    boolean method2(Object lhs,Object rhs){
      if (lhs == rhs) {
        return true;
      }
      if (lhs == null || rhs == null) {
        return false;
      }
      if (!lhs.getClass().equals(rhs.getClass())) {
        return false;
      }
      return true;
    }
}
