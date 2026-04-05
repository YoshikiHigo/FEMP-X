package all;

public class ClonePair9650 {

    int method1(String content,int fromIndex){
      boolean eolStarted=false;
      int index=fromIndex;
      for (; index > 0; index--) {
        if (content.charAt(index - 1) != '\n' && content.charAt(index - 1) != '\r') {
          break;
        }
        if (content.charAt(index - 1) == '\n') {
          if (!eolStarted) {
            eolStarted=true;
            continue;
          }
        }
        if (content.charAt(index - 1) == '\r') {
          --index;
          break;
        }
        if (eolStarted) {
          break;
        }
      }
      return index;
    }

    int method2(String s,int len){
      int plus=0;
      for (int i=0; i < len; i++) {
        char c=s.charAt(i);
        if (c >= 0x800) {
          plus+=2;
        }
     else     if (c >= 0x80) {
          plus++;
        }
      }
      return len + plus;
    }
}
