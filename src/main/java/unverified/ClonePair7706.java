package unverified;

public class ClonePair7706 {

    boolean method1(Object left,Object right){
      if (left == right)   return true;
      if (left == null || right == null)   return false;
      return left.getClass() == right.getClass();
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
