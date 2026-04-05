package all;

public class ClonePair7313 {

    boolean method1(Object obj1,Object obj2){
      if (obj1 == obj2) {
        return true;
      }
      if ((obj1 == null && obj2 != null) || (obj2 == null && obj1 != null) || (obj1.getClass() != obj2.getClass())) {
        return false;
      }
      return obj1.equals(obj2);
    }

    boolean method2(Object value1,Object value2){
      if (value1 == null && value2 == null) {
        return true;
      }
      return value1 != null && value2 != null && value1.equals(value2);
    }
}
