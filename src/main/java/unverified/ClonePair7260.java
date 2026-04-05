package unverified;

public class ClonePair7260 {

    boolean method1(String oldStr,String newStr){
      if (oldStr == null && newStr != null) {
        return false;
      }
      if (oldStr != null && newStr == null) {
        return false;
      }
      if (oldStr == null && newStr == null) {
        return true;
      }
      if (oldStr.equals(newStr)) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(String s1,String s2){
      if (s1 == null || s2 == null)   return (s1 == s2);
     else   return s1.compareTo(s2) == 0;
    }
}
