package all;

public class ClonePair7499 {

    boolean method1(Object oldValue,Object newValue){
      if (oldValue == null && newValue != null)   return true;
      if (newValue == null && oldValue != null)   return true;
      if (oldValue == null && newValue == null)   return false;
      return !oldValue.equals(newValue);
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
