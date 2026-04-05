package all;

public class ClonePair8220 {

    boolean method1(String one,String two){
      if (one == null ^ two == null) {
        return false;
      }
      if (one == null && two == null) {
        return true;
      }
      return one.compareTo(two) == 0;
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
