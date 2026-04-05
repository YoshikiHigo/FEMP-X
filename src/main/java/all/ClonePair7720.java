package all;

public class ClonePair7720 {

    boolean method1(Object value1,Object value2){
      if (value1 == null && value2 == null) {
        return true;
      }
      return value1 != null && value2 != null && value1.equals(value2);
    }

    boolean method2(Object object1,Object object2){
      if (object1 == null)   return (object2 == null);
     else   if (object2 == null)   return false;
     else   if (object1 == object2)   return true;
      return object1.equals(object2);
    }
}
