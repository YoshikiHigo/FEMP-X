package unverified;

public class ClonePair7613 {

    boolean method1(Object apple,Object orange){
      if (apple == null && orange == null) {
        return true;
      }
      if (apple == null || orange == null) {
        return false;
      }
      return (apple.equals(orange) && orange.equals(apple));
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
