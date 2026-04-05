package unverified;

public class ClonePair9090 {

    int method1(String sb,int offset){
      int result;
      for (result=offset; result < sb.length(); result++) {
        if (Character.isWhitespace(sb.charAt(result))) {
          break;
        }
      }
      return result;
    }

    int method2(String s,int start){
      char c;
      int len=s.length();
      while (start < len && !((c=s.charAt(start)) == ' ' || c == '\n' || c == '\r' || c == '\t'))   start++;
      return start;
    }
}
