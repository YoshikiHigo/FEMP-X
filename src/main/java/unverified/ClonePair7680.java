package unverified;

public class ClonePair7680 {

    boolean method1(Object value1,Object value2){
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

    boolean method2(Object o1,Object o2){
      if (o1 == null) {
        if (o2 != null) {
          return false;
        }
      }
     else   if (o2 == null) {
        return false;
      }
     else   if (!o1.equals(o2)) {
        return false;
      }
      return true;
    }
}
