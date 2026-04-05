package all;

public class ClonePair5724 {

    boolean method1(String str,boolean isTrim){
      if (isTrim) {
        return null == str || "".equals(str.trim());
      }
     else {
        return null == str || "".equals(str);
      }
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
