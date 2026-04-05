package all;

public class ClonePair5655 {

    boolean method1(String str,boolean trimWhitespaces){
      if (str == null)   return true;
      if (trimWhitespaces)   return str.trim().length() == 0;
     else   return str.length() == 0;
    }

    boolean method2(String str,boolean isTrim){
      if (isTrim) {
        return null == str || "".equals(str.trim());
      }
     else {
        return null == str || "".equals(str);
      }
    }
}
