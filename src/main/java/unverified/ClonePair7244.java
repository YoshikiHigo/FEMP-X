package unverified;

public class ClonePair7244 {

    boolean method1(Object old_value,Object new_value){
      if (old_value == null) {
        if (new_value == null) {
          return false;
        }
     else {
          return true;
        }
      }
     else {
        if (new_value == null) {
          return true;
        }
     else {
          return !old_value.equals(new_value);
        }
      }
    }

    boolean method2(Object first,Object second){
      if (first == null) {
        if (second != null) {
          return true;
        }
      }
     else   if (second == null) {
        return true;
      }
     else   if (!first.equals(second)) {
        return true;
      }
      return false;
    }
}
