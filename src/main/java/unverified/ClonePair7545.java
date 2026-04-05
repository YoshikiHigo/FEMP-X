package unverified;

public class ClonePair7545 {

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

    boolean method2(Object objA,Object objB){
      if (objA == objB)   return true;
      if (objA == null && objB != null)   return false;
      if (objA != null && objB == null)   return false;
      if (objA.getClass() != objB.getClass())   return false;
      return objA.equals(objB);
    }
}
