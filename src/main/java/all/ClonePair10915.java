package all;

public class ClonePair10915 {

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

    boolean method2(String url){
      boolean retVal=true;
      char[] ch=url.toCharArray();
      int index=0;
      while (index < ch.length) {
        if (!((ch[index] > 96 && ch[index] < 123) || (ch[index] > 46 && ch[index] < 59) || ch[index] == 126 || ch[index] == 63 || ch[index] == 56)) {
          retVal=false;
        }
      }
      return retVal;
    }
}
