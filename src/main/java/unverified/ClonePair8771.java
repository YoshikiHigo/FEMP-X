package unverified;

public class ClonePair8771 {

    int method1(String s,int startOffset){
      final int length=s.length();
      for (int i=startOffset; i < length; i++) {
    switch (s.charAt(i)) {
    case ' ':case '\n':case '\r':case '\t':      return i;
    default:  }
    }
    return -1;
    }

    int method2(String haystack,int start){
      for (int i=start; i < haystack.length(); i++) {
        char c=haystack.charAt(i);
        if (c == ' ' || c == '\n' || c == '\r' || c == '\t')     return i;
      }
      return -1;
    }
}
