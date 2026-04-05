package all;

public class ClonePair8190 {

    int method1(String cond,int sidx,int len){
      while (sidx < len && cond.charAt(sidx) == ' ') {
        sidx++;
      }
      return sidx;
    }

    int method2(String s,int i,int n){
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
}
