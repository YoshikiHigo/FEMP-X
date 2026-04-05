package all;

public class ClonePair7659 {

    boolean method1(String s1,String s2){
      if (s1 == null || s2 == null) {
        return false;
      }
     else {
        return ((s1.length() == s2.length()) && s1.regionMatches(true,0,s2,0,s1.length()));
      }
    }

    boolean method2(String target1,String target2){
      if (target1 == null || target2 == null) {
        return false;
      }
      final int length1=target1.length();
      final int length2=target2.length();
      if (length1 < length2) {
        return false;
      }
      final String s1=target1.substring(length1 - length2);
      return s1.equalsIgnoreCase(target2);
    }
}
