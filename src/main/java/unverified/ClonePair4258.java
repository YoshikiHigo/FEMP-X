package unverified;

public class ClonePair4258 {

    boolean method1(String exStr,String str){
      int i;
      int j;
      for (i=0, j=0; i < exStr.length(); i++) {
        if (exStr.charAt(i) == '*') {
          return true;
        }
        if (j >= str.length()) {
          return false;
        }
        if (exStr.charAt(i) == '?') {
          j++;
          continue;
        }
     else     if (exStr.charAt(i) != str.charAt(j)) {
          return false;
        }
        j++;
      }
      if (j == str.length()) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(String enc1,String enc2){
      enc1=enc1.toLowerCase();
      enc2=enc2.toLowerCase();
      if (enc1.endsWith("be") || enc1.endsWith("le")) {
        enc1=enc1.substring(0,enc1.length() - 2);
      }
      if (enc2.endsWith("be") || enc2.endsWith("le")) {
        enc2=enc2.substring(0,enc2.length() - 2);
      }
      return enc1.equals(enc2);
    }
}
