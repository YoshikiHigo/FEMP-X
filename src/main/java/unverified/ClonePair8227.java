package unverified;

public class ClonePair8227 {

    boolean method1(String one,String two){
      if (one == null ^ two == null) {
        return false;
      }
      if (one == null && two == null) {
        return true;
      }
      return one.compareTo(two) == 0;
    }

    boolean method2(String str1,String str2){
      if ((str1 == null && str2 != null) || (str1 != null && str2 == null)) {
        return false;
      }
      if (str1 == null && str2 == null) {
        return true;
      }
      if (str1.equals(str2)) {
        return true;
      }
      return false;
    }
}
