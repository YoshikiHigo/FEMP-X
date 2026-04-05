package all;

public class ClonePair7657 {

    boolean method1(Object first,Object second){
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
