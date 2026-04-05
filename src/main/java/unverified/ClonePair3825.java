package unverified;

public class ClonePair3825 {

    boolean method1(String strA,String strB){
      if ((strA == null) && (strB == null)) {
        return true;
      }
      if ((strA == null) || (strB == null)) {
        return false;
      }
      return (strA.compareToIgnoreCase(strB) == 0);
    }

    boolean method2(String one,String two){
      if (one == null && two == null) {
        return true;
      }
      if (one == null || two == null) {
        return false;
      }
      return one.compareTo(two) == 0;
    }
}
