package unverified;

public class ClonePair3751 {

    boolean method1(String a,String b){
      if (a != null && a.trim().length() == 0)   a=null;
      if (b != null && b.trim().length() == 0)   b=null;
      boolean rt=false;
      if (a == b)   return true;
      if (a != null && b != null) {
        if (a.compareTo(b) == 0) {
          return true;
        }
      }
      return rt;
    }

    boolean method2(String lhs,String rhs){
      if (lhs == null) {
        if (rhs != null) {
          return false;
        }
      }
     else {
        if (rhs == null || !lhs.equals(rhs)) {
          return false;
        }
      }
      return true;
    }
}
