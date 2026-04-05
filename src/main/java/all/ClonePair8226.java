package all;

public class ClonePair8226 {

    boolean method1(String one,String two){
      if (one == null ^ two == null) {
        return false;
      }
      if (one == null && two == null) {
        return true;
      }
      return one.compareTo(two) == 0;
    }

    boolean method2(String string,String prefix){
      if (string == null || prefix == null) {
        return string == null && prefix == null;
      }
      if (prefix.length() > string.length()) {
        return false;
      }
      return string.regionMatches(true,0,prefix,0,prefix.length());
    }
}
