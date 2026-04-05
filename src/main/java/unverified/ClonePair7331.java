package unverified;

public class ClonePair7331 {

    boolean method1(Object obj1,Object obj2){
      if (obj1 == obj2) {
        return true;
      }
      if ((obj1 == null && obj2 != null) || (obj2 == null && obj1 != null) || (obj1.getClass() != obj2.getClass())) {
        return false;
      }
      return obj1.equals(obj2);
    }

    boolean method2(Object n1,Object n2){
      if (n1 == null || n2 == null)   return false;
      if (!(n1 instanceof Number && n2 instanceof Number)) {
        return n1.equals(n2);
      }
      return ((Number)n1).floatValue() == ((Number)n2).floatValue();
    }
}
