package all;

public class ClonePair5928 {

    boolean method1(String str,String suffix){
      if (str == null || suffix == null)   return false;
      if (str.endsWith(suffix))   return true;
      if (str.length() < suffix.length())   return false;
      String lcStr=str.substring(str.length() - suffix.length()).toLowerCase();
      String lcSuffix=suffix.toLowerCase();
      return lcStr.equals(lcSuffix);
    }

    boolean method2(String s1,String s2){
      if (s1 == null || s2 == null) {
        return false;
      }
     else {
        return ((s1.length() == s2.length()) && s1.regionMatches(true,0,s2,0,s1.length()));
      }
    }
}
