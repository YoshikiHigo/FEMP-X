package unverified;

public class ClonePair9743 {

    int method1(String s,int i){
      int j=i;
      while (j < s.length() && Character.isWhitespace(s.charAt(j))) {
        ++j;
      }
      return j;
    }

    int method2(String s,int start){
      char c;
      int len=s.length();
      while (start < len && ((c=s.charAt(start)) == ' ' || c == '\n' || c == '\r' || c == '\t'))   start++;
      return start;
    }
}
