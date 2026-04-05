package unverified;

public class ClonePair7712 {

    boolean method1(Object value1,Object value2){
      if (value1 == null && value2 == null) {
        return true;
      }
      return value1 != null && value2 != null && value1.equals(value2);
    }

    boolean method2(Object o1,Object o2){
      if (o1 == null)   return o2 == null;
     else   return o2 != null && o1.equals(o2);
    }
}
