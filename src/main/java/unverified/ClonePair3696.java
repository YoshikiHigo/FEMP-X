package unverified;

public class ClonePair3696 {

    boolean method1(String s1,String s2){
      if (s1 == null && s2 == null)   return true;
      if ((s1 == null || s2 == null))   return false;
      if (!s1.equals(s2)) {
        return false;
      }
      return true;
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
