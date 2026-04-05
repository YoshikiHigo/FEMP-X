package all;

public class ClonePair8249 {

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

    boolean method2(String str1,String str2){
      if (str1 == null || str1.length() == 0) {
        if (str2 == null || str2.length() == 0) {
          return true;
        }
     else {
          return false;
        }
      }
     else {
        if (str2 == null) {
          return false;
        }
     else {
          return str1.equals(str2);
        }
      }
    }
}
