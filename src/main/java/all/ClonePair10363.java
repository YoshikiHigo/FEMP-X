package all;

public class ClonePair10363 {

    boolean method1(CharSequence text1,CharSequence text2){
      if (text1 == null && text2 == null)   return true;
     else   if (text1 == null || text2 == null)   return false;
     else {
        if (text1.length() != text2.length())     return false;
        for (int i=0; i < text1.length(); i++) {
          if (text1.charAt(i) != text2.charAt(i))       return false;
        }
      }
      return true;
    }

    boolean method2(CharSequence a,CharSequence b){
      if (a == b) {
        return true;
      }
      if (a == null || b == null) {
        return false;
      }
      int len=a.length();
      if (len == b.length()) {
        for (int i=0; i < len; i++) {
          if (a.charAt(i) != b.charAt(i)) {
            return false;
          }
        }
        return true;
      }
      return false;
    }
}
