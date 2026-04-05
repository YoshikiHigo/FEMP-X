package all;

public class ClonePair7513 {

    boolean method1(Object obj1,Object obj2){
      if ((obj1 == null && obj2 != null) || (obj2 == null && obj1 != null))   return false;
      if (obj1 == null && obj2 == null)   return true;
      if (obj1.equals(obj2))   return true;
     else   return false;
    }

    boolean method2(Object o1,Object o2){
      if (o1 == null) {
        return o2 == null;
      }
      return o2 != null && (o1 == o2 || o1.getClass() == o2.getClass() && o1.hashCode() == o2.hashCode());
    }
}
