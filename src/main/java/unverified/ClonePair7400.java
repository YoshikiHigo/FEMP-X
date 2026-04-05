package unverified;

public class ClonePair7400 {

    boolean method1(Object o1,Object o2){
      if (o1 == null) {
        return o2 == null;
      }
      if (o1 instanceof Integer && o2 instanceof Integer)   return ((Integer)o1).equals((Integer)o2);
     else   return o1.equals(o2);
    }

    boolean method2(Object apple,Object orange){
      if (apple == null && orange == null) {
        return true;
      }
      if (apple == null || orange == null) {
        return false;
      }
      return (apple.equals(orange) && orange.equals(apple));
    }
}
