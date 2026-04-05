package unverified;

public class ClonePair7498 {

    boolean method1(Object oldValue,Object newValue){
      if (oldValue == null && newValue != null)   return true;
      if (newValue == null && oldValue != null)   return true;
      if (oldValue == null && newValue == null)   return false;
      return !oldValue.equals(newValue);
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
