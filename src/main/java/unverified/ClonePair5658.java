package unverified;

public class ClonePair5658 {

    boolean method1(String str,boolean trimWhitespaces){
      if (str == null)   return true;
      if (trimWhitespaces)   return str.trim().length() == 0;
     else   return str.length() == 0;
    }

    boolean method2(String str,boolean trim){
      if (str == null || str.length() == 0) {
        return true;
      }
      if (!trim)   return false;
      final int len=str.length();
      for (int i=0; i < len; i++) {
        if (str.charAt(i) > ' ')     return false;
      }
      return true;
    }
}
