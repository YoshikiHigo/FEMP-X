package all;

public class ClonePair7306 {

    boolean method1(Object obj1,Object obj2){
      if (obj1 == obj2) {
        return true;
      }
      if ((obj1 == null && obj2 != null) || (obj2 == null && obj1 != null) || (obj1.getClass() != obj2.getClass())) {
        return false;
      }
      return obj1.equals(obj2);
    }

    boolean method2(Object t1,Object t2){
      if (t1 instanceof Number && t2 instanceof Number) {
        return ((Number)t1).doubleValue() == ((Number)t2).doubleValue();
      }
     else {
        if (t1 == null || t2 == null) {
          return false;
        }
        return t1.equals(t2);
      }
    }
}
