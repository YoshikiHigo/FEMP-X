package all;

public class ClonePair9121 {

    int method1(String s,int n){
      while (n < s.length()) {
        final char c=s.charAt(n);
        if (c == ' ' || c == '\t' || c == '\n')     n++;
     else     break;
      }
      return n;
    }

    int method2(String template,int i){
      while (i < template.length() && Character.isWhitespace(template.charAt(i))) {
        i++;
      }
      return i;
    }
}
