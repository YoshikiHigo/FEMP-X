package unverified;

public class ClonePair7535 {

    boolean method1(Object a,Object b){
      if (a == b)   return true;
     else   if ((a == null) || (b == null))   return false;
     else   return a.getClass() == b.getClass();
    }

    boolean method2(Object lhs,Object rhs){
      if (lhs == rhs) {
        return true;
      }
      if (lhs == null || rhs == null) {
        return false;
      }
      if (!lhs.getClass().equals(rhs.getClass())) {
        return false;
      }
      return true;
    }
}
