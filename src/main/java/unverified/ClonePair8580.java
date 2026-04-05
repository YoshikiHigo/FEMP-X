package unverified;

public class ClonePair8580 {

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

    int method2(String s,int i){
      int j=i;
      while (j < s.length() && Character.isWhitespace(s.charAt(j))) {
        ++j;
      }
      return j;
    }
}
