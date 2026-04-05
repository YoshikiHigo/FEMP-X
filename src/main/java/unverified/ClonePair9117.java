package unverified;

public class ClonePair9117 {

    int method1(String s,int n){
      while (n < s.length()) {
        final char c=s.charAt(n);
        if (c == ' ' || c == '\t' || c == '\n')     n++;
     else     break;
      }
      return n;
    }

    int method2(String dnChain,int startIndex){
      while (startIndex < dnChain.length() && dnChain.charAt(startIndex) == ' ')   startIndex++;
      return startIndex;
    }
}
