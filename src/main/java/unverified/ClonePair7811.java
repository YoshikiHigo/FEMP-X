package unverified;

public class ClonePair7811 {

    boolean method1(Object o1,Object o2){
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

    boolean method2(Object value,Object target){
      if ((value == null) && (target == null)) {
        return true;
      }
     else   if ((value == null) || (target == null)) {
        return false;
      }
     else   if (value.equals(target)) {
        return true;
      }
     else {
        return value.toString().equals(target.toString());
      }
    }
}
