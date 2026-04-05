package all;

public class ClonePair9115 {

    int method1(String s,int n){
      while (n < s.length()) {
        final char c=s.charAt(n);
        if (c == ' ' || c == '\t' || c == '\n')     n++;
     else     break;
      }
      return n;
    }

    int method2(String sb,int offset){
      int result;
      for (result=offset; result < sb.length(); result++) {
        if (!Character.isWhitespace(sb.charAt(result))) {
          break;
        }
      }
      return result;
    }
}
