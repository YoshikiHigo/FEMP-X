package unverified;

public class ClonePair7560 {

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

    boolean method2(Object o1,Object o2){
      if (o1 == null && o2 == null)   return true;
      if (o1 == null || o2 == null)   return false;
      if (o1.equals(o2))   return true;
     else   return false;
    }
}
