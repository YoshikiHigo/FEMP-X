package unverified;

public class ClonePair10165 {

    int method1(String s,int start){
      while ((start < s.length()) && Character.isWhitespace(s.charAt(start)))   start++;
      return start;
    }

    int method2(String sb,int offset){
      int result;
      for (result=offset; result < sb.length(); result++) {
        if (!Character.isWhitespace(sb.charAt(result))) {
          break;
        }
      }
      return result;
    }
}
