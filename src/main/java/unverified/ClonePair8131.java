package unverified;

public class ClonePair8131 {

    boolean method1(String p1,String p2){
      if ((p1 == null && p2 != null) || (p2 == null && p1 != null)) {
        return false;
      }
      if (p1 == null && p2 == null) {
        return true;
      }
      if (p1.equals(p2) || p1.startsWith(p2)) {
        return true;
      }
      return false;
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
