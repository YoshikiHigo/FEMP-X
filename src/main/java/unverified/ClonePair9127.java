package unverified;

public class ClonePair9127 {

    int method1(String s,int startIdx){
      int len=s.length();
      while ((startIdx < len) && Character.isWhitespace(s.charAt(startIdx))) {
        startIdx++;
      }
      return startIdx;
    }

    int method2(String s,int start){
      char c;
      int len=s.length();
      while (start < len && ((c=s.charAt(start)) == ' ' || c == '\n' || c == '\r' || c == '\t'))   start++;
      return start;
    }
}
