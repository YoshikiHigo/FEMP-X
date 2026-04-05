package unverified;

public class ClonePair6942 {

    boolean method1(String s1,String s2){
      if ((s1 == null) || (s2 == null)) {
        return false;
      }
      return (s1.length() == s2.length()) && (s1.toUpperCase().equals(s2.toUpperCase()));
    }

    boolean method2(String str,String suffix){
      if (str == null || suffix == null) {
        return false;
      }
      if (str.startsWith(suffix)) {
        return true;
      }
      if (str.length() < suffix.length()) {
        return false;
      }
      String lcStr=str.substring(str.length() - suffix.length()).toLowerCase();
      String lcPrefix=suffix.toLowerCase();
      return lcStr.equals(lcPrefix);
    }
}
