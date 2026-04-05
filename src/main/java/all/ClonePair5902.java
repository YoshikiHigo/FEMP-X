package all;

public class ClonePair5902 {

    boolean method1(String str1,String str2){
      boolean match=false;
      if (str1 == null && str2 == null) {
        match=true;
      }
     else   if (str1 == null || str2 == null) {
        match=false;
      }
     else   if (str1.equals(str2)) {
        match=true;
      }
      return match;
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
