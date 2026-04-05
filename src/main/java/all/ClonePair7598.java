package all;

public class ClonePair7598 {

    boolean method1(Object t1,Object t2){
      if (t1 instanceof Number && t2 instanceof Number) {
        return ((Number)t1).doubleValue() == ((Number)t2).doubleValue();
      }
     else {
        if (t1 == null || t2 == null) {
          return false;
        }
        return t1.equals(t2);
      }
    }

    boolean method2(Object objA,Object objB){
      if (objA == objB)   return true;
      if (objA == null && objB != null)   return false;
      if (objA != null && objB == null)   return false;
      if (objA.getClass() != objB.getClass())   return false;
      return objA.equals(objB);
    }
}
