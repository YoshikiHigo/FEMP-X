package unverified;

public class ClonePair7312 {

    boolean method1(Object obj1,Object obj2){
      if (obj1 == obj2) {
        return true;
      }
      if ((obj1 == null && obj2 != null) || (obj2 == null && obj1 != null) || (obj1.getClass() != obj2.getClass())) {
        return false;
      }
      return obj1.equals(obj2);
    }

    boolean method2(Object o1,Object o2){
      if (o1 == null) {
        return o2 == null;
      }
      return o2 != null && (o1 == o2 || o1.getClass() == o2.getClass() && o1.hashCode() == o2.hashCode());
    }
}
