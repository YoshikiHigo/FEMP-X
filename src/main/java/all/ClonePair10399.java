package all;

public class ClonePair10399 {

    boolean method1(CharSequence text1,CharSequence text2){
      if (text1 == text2) {
        return true;
      }
      int len=text1.length();
      if (len == text2.length()) {
        for (int i=len - 1; i >= 0; i--) {
          if (text1.charAt(i) != text2.charAt(i)) {
            return false;
          }
        }
        return true;
      }
      return false;
    }

    boolean method2(CharSequence cs1,CharSequence cs2){
      if (cs1 == cs2)   return true;
      int len=cs1.length();
      if (len != cs2.length())   return false;
      for (int i=0; i < len; ++i)   if (cs1.charAt(i) != cs2.charAt(i))   return false;
      return true;
    }
}
