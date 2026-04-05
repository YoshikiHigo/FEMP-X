package all;

public class ClonePair7671 {

    boolean method1(String s1,String s2){
      if (s1 == null || s2 == null) {
        return false;
      }
     else {
        return ((s1.length() == s2.length()) && s1.regionMatches(true,0,s2,0,s1.length()));
      }
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
