package all;

public class ClonePair10924 {

    boolean method1(String str){
      for (int i=str.length() - 1; i >= 0; i--) {
        char ch=str.charAt(i);
        if (ch > 0x007f) {
          return false;
        }
        if ('a' <= ch && ch <= 'z') {
          continue;
        }
        if ('A' <= ch && ch <= 'Z') {
          continue;
        }
        if ('0' <= ch && ch <= '9') {
          continue;
        }
    switch (ch) {
    case ' ':case '\'':case '(':case ')':case '+':case '-':case '.':case ':':case '=':case '?':case '/':case ',':      continue;
      }
      return false;
    }
    return true;
    }

    boolean method2(String str){
      for (int i=0; i < str.length(); ++i) {
        char ch=str.charAt(i);
        if (!(ch == 0x20 || ch >= 0x27 && ch <= 0x29 || ch >= 0x2B && ch <= 0x3A || ch == '=' || ch == '?' || ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')) {
          return false;
        }
      }
      return true;
    }
}
