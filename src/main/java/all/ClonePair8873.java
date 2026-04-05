package all;

public class ClonePair8873 {

    boolean method1(String name1,String name2){
      int nameLen=name1.length();
      if (nameLen != name2.length()) {
        return false;
      }
      for (int i=nameLen - 1; i >= 0; i--) {
        char c1=name1.charAt(i);
        char c2=name2.charAt(i);
        if (c1 != c2) {
          if (c1 >= 'A' && c1 <= 'Z') {
            c1+=32;
          }
          if (c2 >= 'A' && c2 <= 'Z') {
            c2+=32;
          }
          if (c1 != c2) {
            return false;
          }
        }
      }
      return true;
    }

    boolean method2(String s1,String s2){
      if (s1.length() == s2.length()) {
        final char c1[]=s1.toCharArray();
        final char c2[]=s2.toCharArray();
        int n=s1.length();
        while (--n >= 0) {
          if (c1[n] != c2[n]) {
            return false;
          }
        }
      }
     else {
        return false;
      }
      return true;
    }
}
