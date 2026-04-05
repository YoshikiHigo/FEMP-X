package unverified;

public class ClonePair9110 {

    int method1(String s,int n){
      while (n < s.length()) {
        final char c=s.charAt(n);
        if (c == ' ' || c == '\t' || c == '\n')     n++;
     else     break;
      }
      return n;
    }

    int method2(String rawdata,int i){
      int length=rawdata.length();
      if (i < length) {
        char c=rawdata.charAt(i);
        while ((i < length) && Character.isWhitespace(c)) {
          ++i;
          c=rawdata.charAt(i);
        }
      }
      return i;
    }
}
