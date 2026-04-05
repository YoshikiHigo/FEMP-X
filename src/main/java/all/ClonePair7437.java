package all;

public class ClonePair7437 {

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

    boolean method2(Object actExc,Object expExc){
      if (expExc == null) {
        return actExc == null;
      }
     else {
        return actExc != null && expExc.getClass() == actExc.getClass();
      }
    }
}
