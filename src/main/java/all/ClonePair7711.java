package all;

public class ClonePair7711 {

    boolean method1(Object value1,Object value2){
      if (value1 == null && value2 == null) {
        return true;
      }
      return value1 != null && value2 != null && value1.equals(value2);
    }

    boolean method2(Object a,Object b){
      if (a == b)   return true;
      if (a == null || b == null)   return false;
      if (a instanceof Number && b instanceof Number) {
        Number aa=(Number)a;
        Number bb=(Number)b;
        double diff=Math.abs(aa.doubleValue() - bb.doubleValue());
        return diff < 0.00001;
      }
      return a.equals(b);
    }
}
