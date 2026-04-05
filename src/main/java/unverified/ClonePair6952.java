package unverified;

public class ClonePair6952 {

    int method1(int from,String content){
      int pos=0;
      for (pos=from; pos < content.length(); ++pos) {
        char c=content.charAt(pos);
        if (c == '\n' || c == '\r' || c == ';') {
          return pos;
        }
        if (!Character.isWhitespace(c)) {
          return pos;
        }
      }
      if (pos == content.length()) {
        return pos;
      }
      return from;
    }

    int method2(int i,String s){
      for (; i < s.length() && (s.charAt(i) == ' ' || s.charAt(i) == '\t'); i++) {
        ;
      }
      return i;
    }
}
