package unverified;

public class ClonePair9147 {

    int method1(String s,int pos){
      while (pos < s.length() && !Character.isWhitespace(s.charAt(pos)))   pos++;
      return pos;
    }

    int method2(String s,int start){
      char c;
      int len=s.length();
      while (start < len && !((c=s.charAt(start)) == ' ' || c == '\n' || c == '\r' || c == '\t'))   start++;
      return start;
    }
}
