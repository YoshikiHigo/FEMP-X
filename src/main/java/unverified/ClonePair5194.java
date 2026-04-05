package unverified;

public class ClonePair5194 {

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
}
