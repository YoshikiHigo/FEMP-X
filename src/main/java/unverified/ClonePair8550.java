package unverified;

public class ClonePair8550 {

    boolean method1(String string,String pattern){
      for (int i=0, j=0; i < pattern.length(); i++, j++) {
        if (pattern.charAt(i) == '*') {
          if (i == pattern.length() - 1) {
            return true;
          }
     else       if (j == string.length() - 1) {
            return false;
          }
     else       if (pattern.charAt(i + 1) == '*') {
            j--;
            continue;
          }
     else       if (pattern.charAt(i + 1) == string.charAt(j + 1)) {
            continue;
          }
     else {
            i--;
            continue;
          }
        }
     else     if (pattern.charAt(i) != string.charAt(j)) {
          return false;
        }
      }
      return true;
    }

    boolean method2(String val,String end){
      int i=val.length() - 1;
      for (int iEnd=end.length() - 1; iEnd >= 0; i--, iEnd--) {
        if (val.charAt(i) != end.charAt(iEnd))     return false;
      }
      return true;
    }
}
