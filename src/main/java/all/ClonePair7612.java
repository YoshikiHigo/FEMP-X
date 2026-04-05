package all;

public class ClonePair7612 {

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
      if (o1 == null)   return o2 == null;
     else   return o2 != null && o1.equals(o2);
    }
}
