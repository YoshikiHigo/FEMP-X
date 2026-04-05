package all;

public class ClonePair9195 {

    boolean method1(String str,String suffix){
      if (str == null || suffix == null) {
        return (str == null && suffix == null);
      }
      if (suffix.length() > str.length()) {
        return false;
      }
      int strOffset=str.length() - suffix.length();
      return str.regionMatches(false,strOffset,suffix,0,suffix.length());
    }

    boolean method2(String str1,String str2){
      if ((str1 == null && str2 != null) || (str1 != null && str2 == null)) {
        return false;
      }
      if (str1 == null && str2 == null) {
        return true;
      }
      if (str1.equals(str2)) {
        return true;
      }
      return false;
    }
}
