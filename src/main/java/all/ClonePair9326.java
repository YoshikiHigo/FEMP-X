package all;

public class ClonePair9326 {

    int method1(String data,int i){
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

    int method2(String haystack,int start){
      for (int i=start; i < haystack.length(); i++) {
        char c=haystack.charAt(i);
        if (c == ' ' || c == '\n' || c == '\r' || c == '\t')     return i;
      }
      return -1;
    }
}
