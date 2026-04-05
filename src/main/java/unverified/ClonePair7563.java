package unverified;

public class ClonePair7563 {

    boolean method1(Object thisObject,Object thatObject){
      if (thisObject == null) {
        return thatObject == null;
      }
     else   if (thatObject == null) {
        return false;
      }
     else   if (thisObject.equals(thatObject) == false) {
        return false;
      }
      return true;
    }

    boolean method2(Object value1,Object value2){
      if (value1 == null) {
        return value2 == null;
      }
     else   if (value2 == null) {
        return false;
      }
      if (value1.getClass() != value2.getClass()) {
        return false;
      }
      return value1.equals(value2);
    }
}
