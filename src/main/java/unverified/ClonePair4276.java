package unverified;

public class ClonePair4276 {

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

    boolean method2(String s1,String s2){
      if (s1.length() != s2.length()) {
        System.out.println("Compare failed: lengths differ");
        return false;
      }
      for (int i=0; i < s1.length(); i++) {
        if (s1.charAt(i) != s2.charAt(i)) {
          System.out.println("Compare failed: bytes at " + i + " differ ["+ s1.charAt(i)+ "] ["+ s2.charAt(i)+ "]");
          return false;
        }
      }
      return true;
    }
}
