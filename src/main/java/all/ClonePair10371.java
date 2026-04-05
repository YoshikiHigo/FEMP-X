package all;

public class ClonePair10371 {

    boolean method1(CharSequence pSeq1,CharSequence pSeq2){
      if (pSeq1 == pSeq2) {
        return true;
      }
      if (pSeq1.length() != pSeq2.length()) {
        return false;
      }
      for (int i=0; i < pSeq1.length(); i++) {
        if (pSeq1.charAt(i) != pSeq2.charAt(i)) {
          return false;
        }
      }
      return true;
    }

    boolean method2(CharSequence text1,CharSequence text2){
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
}
