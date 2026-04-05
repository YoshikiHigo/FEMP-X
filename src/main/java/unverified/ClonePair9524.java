package unverified;

public class ClonePair9524 {

    int method1(String string,int pos){
      final int length=string.length();
      while ((pos < length) && !Character.isWhitespace(string.charAt(pos))) {
        pos++;
      }
      return pos;
    }

    int method2(String s,int start){
      char c;
      int len=s.length();
      while (start < len && !((c=s.charAt(start)) == ' ' || c == '\n' || c == '\r' || c == '\t'))   start++;
      return start;
    }
}
