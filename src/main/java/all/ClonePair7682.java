package all;

public class ClonePair7682 {

    boolean method1(Object value1,Object value2){
      if (value1 == null) {
        return value2 == null;
      }
     else   if (value2 == null) {
        return false;
      }
      if (value1.getClass() != value2.getClass()) {
        return false;
      }
      return value1.equals(value2);
    }

    boolean method2(Object obj1,Object obj2){
      if (obj1 == null)   return (obj2 == null);
      return ((obj2 != null) && obj1.equals(obj2));
    }
}
