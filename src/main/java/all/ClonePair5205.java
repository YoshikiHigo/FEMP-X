package all;

public class ClonePair5205 {

    int method1(String s,char c){
      int i=0;
      while (i < s.length()) {
        if (s.charAt(i) == '\\') {
          ++i;
        }
     else {
          if (s.charAt(i) == c)       return i;
        }
        ++i;
      }
      return -1;
    }

    int method2(String s,char c){
      for (int i=s.length() - 1; i >= 0; i--) {
        if (s.charAt(i) == c) {
          if (i == 0 || s.charAt(i - 1) != '\\')       return i;
     else       continue;
        }
      }
      return -1;
    }
}
