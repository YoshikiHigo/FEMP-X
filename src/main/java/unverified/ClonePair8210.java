package unverified;

public class ClonePair8210 {

    boolean method1(String one,String two){
      if (one == null ^ two == null) {
        return false;
      }
      if (one == null && two == null) {
        return true;
      }
      return one.compareTo(two) == 0;
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
