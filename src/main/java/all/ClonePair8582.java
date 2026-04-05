package all;

public class ClonePair8582 {

    int method1(String s,int start){
      int limit=s.length();
      int i=start;
      for (; i < limit; i++) {
        if (s.charAt(i) != ' ') {
          break;
        }
      }
      return i;
    }

    int method2(String s,int start){
      while ((start < s.length()) && Character.isWhitespace(s.charAt(start)))   start++;
      return start;
    }
}
