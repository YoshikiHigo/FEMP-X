package all;

public class ClonePair8386 {

    int method1(String string,int p){
      while (p < string.length() && !Character.isWhitespace(string.charAt(p))) {
        p++;
      }
      return p;
    }

    int method2(String s,int start){
      char c;
      int len=s.length();
      while (start < len && !((c=s.charAt(start)) == ' ' || c == '\n' || c == '\r' || c == '\t'))   start++;
      return start;
    }
}
