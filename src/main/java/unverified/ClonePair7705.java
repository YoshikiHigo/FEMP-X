package unverified;

public class ClonePair7705 {

    boolean method1(String s1,String s2){
      if (s1 == null || s2 == null) {
        return false;
      }
     else {
        return ((s1.length() == s2.length()) && s1.regionMatches(true,0,s2,0,s1.length()));
      }
    }

    boolean method2(String str,String prefix){
      if (str == null || prefix == null) {
        return false;
      }
      if (str.startsWith(prefix)) {
        return true;
      }
      if (str.length() < prefix.length()) {
        return false;
      }
      String lcStr=str.substring(0,prefix.length()).toLowerCase();
      String lcPrefix=prefix.toLowerCase();
      return lcStr.equals(lcPrefix);
    }
}
