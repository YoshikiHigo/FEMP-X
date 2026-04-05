package all;

public class ClonePair8579 {

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

    int method2(String rawdata,int i){
      int length=rawdata.length();
      if (i < length) {
        char c=rawdata.charAt(i);
        while ((i < length) && Character.isWhitespace(c)) {
          ++i;
          c=rawdata.charAt(i);
        }
      }
      return i;
    }
}
