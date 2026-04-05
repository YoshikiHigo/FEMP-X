package all;

public class ClonePair8203 {

    int method1(String s,int i,int n){
      char c;
      for (; i < n; i++) {
        c=s.charAt(i);
        if (c == ' ' || c == '\t') {
          continue;
        }
        if (c == '\r') {
          if (i == n - 1 || s.charAt(i + 1) != '\n') {
            return i;
          }
          i++;
        }
     else {
          return i;
        }
      }
      return i;
    }

    int method2(String ss,int i,int l){
      while (i < l) {
        if (!Character.isWhitespace(ss.charAt(i))) {
          break;
        }
        i++;
      }
      return i;
    }
}
