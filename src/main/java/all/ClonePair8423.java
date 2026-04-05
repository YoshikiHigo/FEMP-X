package all;

public class ClonePair8423 {

    boolean method1(String a,String b){
      boolean result=a == null && b == null;
      if (!result) {
        result=a != null && b != null && a.equals(b);
      }
      return result;
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
