package all;

public class ClonePair5192 {

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

    int method2(String s,char toFind){
      int deep=0;
      for (int i=0; i < s.length(); i++) {
        char c=s.charAt(i);
        if ((deep == 0) && (c == toFind))     return i;
        if (c == '"')     deep=1 - deep;
        if (c == '\'')     deep=1 - deep;
      }
      return -1;
    }
}
