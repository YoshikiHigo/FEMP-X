package all;

public class ClonePair7245 {

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

    boolean method2(Object o1,Object o2){
      if (o1 == null && o2 == null) {
        return false;
      }
      if (o1 != null && o2 == null) {
        return true;
      }
      if (o2 != null && o1 == null) {
        return true;
      }
      return !o1.equals(o2);
    }
}
