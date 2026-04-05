package unverified;

public class ClonePair7624 {

    boolean method1(Object o1,Object o2){
      if (o1 == null && o2 == null)   return true;
      if (o1 == null || o2 == null)   return false;
      if (o1.equals(o2))   return true;
     else   return false;
    }

    boolean method2(Object value1,Object value2){
      if (value1 == null && value2 == null) {
        return true;
      }
      return value1 != null && value2 != null && value1.equals(value2);
    }
}
