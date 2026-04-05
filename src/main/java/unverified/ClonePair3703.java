package unverified;

public class ClonePair3703 {

    boolean method1(String s1,String s2){
      if (s1 == null && s2 == null)   return true;
      if ((s1 == null || s2 == null))   return false;
      if (!s1.equals(s2)) {
        return false;
      }
      return true;
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
