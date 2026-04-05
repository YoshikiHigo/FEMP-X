package unverified;

public class ClonePair5199 {

    int method1(String s,char toFind){
      int deep=0;
      for (int i=0; i < s.length(); i++) {
        char c=s.charAt(i);
        if ((deep == 0) && (c == toFind))     return i;
        if (c == '"')     deep=1 - deep;
        if (c == '\'')     deep=1 - deep;
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
