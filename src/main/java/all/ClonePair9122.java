package all;

public class ClonePair9122 {

    int method1(String s,int n){
      while (n < s.length()) {
        final char c=s.charAt(n);
        if (c == ' ' || c == '\t' || c == '\n')     n++;
     else     break;
      }
      return n;
    }

    int method2(String s,int pos){
      while (pos < s.length() && Character.isWhitespace(s.charAt(pos)))   pos++;
      return pos;
    }
}
