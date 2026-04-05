package all;

public class ClonePair7642 {

    boolean method1(Object objA,Object objB){
      if (objA == objB)   return true;
      if (objA == null && objB != null)   return false;
      if (objA != null && objB == null)   return false;
      if (objA.getClass() != objB.getClass())   return false;
      return objA.equals(objB);
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
