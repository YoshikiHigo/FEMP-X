package all;

public class ClonePair10364 {

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

    boolean method2(CharSequence text1,CharSequence text2){
      if (text1 == null) {
        if (text2 == null) {
          return true;
        }
     else {
          return false;
        }
      }
     else   if (text2 == null) {
        return false;
      }
      if (text1.length() != text2.length()) {
        return false;
      }
      for (int i=0; i < text1.length(); i++) {
        if (text1.charAt(i) != text2.charAt(i)) {
          return false;
        }
      }
      return true;
    }
}
