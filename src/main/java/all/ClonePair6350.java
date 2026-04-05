package all;

public class ClonePair6350 {

    boolean method1(String str,String suffix){
      if (str == null || suffix == null) {
        return (str == null && suffix == null);
      }
      if (suffix.length() > str.length()) {
        return false;
      }
      int strOffset=str.length() - suffix.length();
      return str.regionMatches(true,strOffset,suffix,0,suffix.length());
    }

    boolean method2(String p1,String p2){
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
}
