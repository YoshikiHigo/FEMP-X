package all;

public class ClonePair6960 {

    boolean method1(String s1,String s2){
      if ((s1 == null) || (s2 == null)) {
        return false;
      }
      return (s1.length() == s2.length()) && (s1.toUpperCase().equals(s2.toUpperCase()));
    }

    boolean method2(String str,String prefix){
      if (str == null || prefix == null)   return false;
      if (str.startsWith(prefix))   return true;
      if (str.length() < prefix.length())   return false;
      String lcStr=str.substring(0,prefix.length()).toLowerCase();
      String lcPrefix=prefix.toLowerCase();
      return lcStr.equals(lcPrefix);
    }
}
