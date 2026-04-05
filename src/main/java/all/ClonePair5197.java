package all;

public class ClonePair5197 {

    int method1(String str,char findme){
      for (int i=0; i < str.length(); i++) {
        char c=str.charAt(i);
        if (c == '\\') {
          i++;
          continue;
        }
     else     if (c == findme)     return i;
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
