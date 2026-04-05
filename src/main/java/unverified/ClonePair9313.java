package unverified;

public class ClonePair9313 {

    boolean method1(String str,String prefix){
      if (str == null || prefix == null)   return false;
      if (str.startsWith(prefix))   return true;
      if (str.length() < prefix.length())   return false;
      String lcStr=str.substring(0,prefix.length()).toLowerCase();
      String lcPrefix=prefix.toLowerCase();
      return lcStr.equals(lcPrefix);
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
