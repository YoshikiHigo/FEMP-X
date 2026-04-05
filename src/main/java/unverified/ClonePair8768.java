package unverified;

public class ClonePair8768 {

    int method1(String s,int startOffset){
      final int length=s.length();
      for (int i=startOffset; i < length; i++) {
    switch (s.charAt(i)) {
    case ' ':case '\n':case '\r':case '\t':      return i;
    default:  }
    }
    return -1;
    }

    int method2(String data,int i){
      int bCount=0;
      while (i < data.length()) {
        if (data.charAt(i) == '{') {
          ++bCount;
        }
     else     if (data.charAt(i) == '}') {
          --bCount;
        }
     else     if (data.charAt(i) == '\\') {
          ++i;
        }
     else     if (bCount == 0 && Character.isWhitespace(data.charAt(i))) {
          return i;
        }
        ++i;
      }
      if (bCount > 0) {
        return -1;
      }
      return -1;
    }
}
