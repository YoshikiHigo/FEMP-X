package unverified;

public class ClonePair7602 {

    boolean method1(Object t1,Object t2){
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

    boolean method2(Object n1,Object n2){
      if (n1 == null || n2 == null)   return false;
      if (!(n1 instanceof Number && n2 instanceof Number)) {
        return n1.equals(n2);
      }
      return ((Number)n1).floatValue() == ((Number)n2).floatValue();
    }
}
