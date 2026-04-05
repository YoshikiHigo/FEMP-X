package all;

public class ClonePair8254 {

    boolean method1(String lhs,String rhs){
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

    boolean method2(String stringA,String stringB){
      if (stringA == null) {
        if (stringB == null) {
          return true;
        }
     else {
          return false;
        }
      }
      if (stringB == null)   return false;
      if (stringA.compareTo(stringB) == 0) {
        return true;
      }
     else {
        return false;
      }
    }
}
