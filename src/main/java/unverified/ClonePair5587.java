package unverified;

public class ClonePair5587 {

    boolean method1(String a,String b){
      if (a == null && b == null)   return true;
      if (a == null)   return false;
      if (b == null)   return false;
      if (a.compareTo(b) == 0)   return true;
     else   return false;
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
