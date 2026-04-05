package all;

public class ClonePair8202 {

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

    int method2(String text,int start,int len){
      while (start < len && text.charAt(start) <= 32) {
        start++;
      }
      return start;
    }
}
