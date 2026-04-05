package unverified;

public class ClonePair8222 {

    boolean method1(String one,String two){
      if (one == null ^ two == null) {
        return false;
      }
      if (one == null && two == null) {
        return true;
      }
      return one.compareTo(two) == 0;
    }

    boolean method2(String str,String suffix){
      if (str == null || suffix == null) {
        return (str == null && suffix == null);
      }
      if (suffix.length() > str.length()) {
        return false;
      }
      int strOffset=str.length() - suffix.length();
      return str.regionMatches(false,strOffset,suffix,0,suffix.length());
    }
}
