package unverified;

public class ClonePair9054 {

    boolean method1(String s,String start){
      if ((s == null) || (start == null)) {
        return false;
      }
      if (start.length() > s.length()) {
        return false;
      }
      String temp=s.substring(0,start.length());
      if (temp.equalsIgnoreCase(start)) {
        return true;
      }
     else {
        return false;
      }
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
