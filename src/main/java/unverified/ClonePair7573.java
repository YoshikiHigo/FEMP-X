package unverified;

public class ClonePair7573 {

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

    boolean method2(Object obj1,Object obj2){
      if (obj1 == null)   return (obj2 == null);
      return ((obj2 != null) && obj1.equals(obj2));
    }
}
