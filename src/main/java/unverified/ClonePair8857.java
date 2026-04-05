package unverified;

public class ClonePair8857 {

    boolean method1(String s,String end){
      if ((s == null) || (end == null))   return false;
      if (end.length() > s.length())   return false;
      String temp=s.substring(s.length() - end.length(),s.length());
      if (temp.equalsIgnoreCase(end))   return true;
     else   return false;
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
