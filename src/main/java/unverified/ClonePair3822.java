package unverified;

public class ClonePair3822 {

    boolean method1(String strA,String strB){
      if ((strA == null) && (strB == null)) {
        return true;
      }
      if ((strA == null) || (strB == null)) {
        return false;
      }
      return (strA.compareToIgnoreCase(strB) == 0);
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
