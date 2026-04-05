package all;

public class ClonePair10372 {

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

    boolean method2(CharSequence cs1,CharSequence cs2){
      if (cs1 == cs2)   return true;
      int len=cs1.length();
      if (len != cs2.length())   return false;
      for (int i=0; i < len; ++i)   if (cs1.charAt(i) != cs2.charAt(i))   return false;
      return true;
    }
}
