package all;

public class ClonePair7684 {

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
