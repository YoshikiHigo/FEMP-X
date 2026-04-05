package unverified;

public class ClonePair8551 {

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

    boolean method2(String str,String subStr){
      for (int i=0; i < subStr.length(); i++) {
        if (subStr.charAt(i) != str.charAt(i)) {
          return false;
        }
      }
      return true;
    }
}
