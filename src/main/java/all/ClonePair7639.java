package all;

public class ClonePair7639 {

    boolean method1(Object lhs,Object rhs){
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

    boolean method2(Object actExc,Object expExc){
      if (expExc == null) {
        return actExc == null;
      }
     else {
        return actExc != null && expExc.getClass() == actExc.getClass();
      }
    }
}
