package unverified;

public class ClonePair7541 {

    boolean method1(Object a,Object b){
      if (a == null || b == null) {
        return a == b;
      }
      if (a instanceof Double && b instanceof Double) {
        Double ad=(Double)a;
        Double bd=(Double)b;
        return ad.doubleValue() == bd.doubleValue();
      }
      return a == b;
    }

    boolean method2(Object thisObject,Object thatObject){
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
}
