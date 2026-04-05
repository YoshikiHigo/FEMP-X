package all;

public class ClonePair7505 {

    boolean method1(Object obj1,Object obj2){
      if ((obj1 == null && obj2 != null) || (obj2 == null && obj1 != null))   return false;
      if (obj1 == null && obj2 == null)   return true;
      if (obj1.equals(obj2))   return true;
     else   return false;
    }

    boolean method2(Object a,Object b){
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
}
