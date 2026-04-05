package unverified;

public class ClonePair8577 {

    int method1(String s,int start){
      int limit=s.length();
      int i=start;
      for (; i < limit; i++) {
        if (s.charAt(i) != ' ') {
          break;
        }
      }
      return i;
    }

    int method2(String s,int n){
      while (n < s.length()) {
        final char c=s.charAt(n);
        if (c == ' ' || c == '\t' || c == '\n')     n++;
     else     break;
      }
      return n;
    }
}
