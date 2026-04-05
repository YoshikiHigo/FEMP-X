package unverified;

public class ClonePair7544 {

    boolean method1(Object a,Object b){
      if (a == null || b == null) {
        return a == b;
      }
      if (a instanceof Double && b instanceof Double) {
        Double ad=(Double)a;
        Double bd=(Double)b;
        return ad.doubleValue() == bd.doubleValue();
      }
      return a == b;
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
