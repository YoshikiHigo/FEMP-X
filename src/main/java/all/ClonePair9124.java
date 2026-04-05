package all;

public class ClonePair9124 {

    int method1(String s,int startIdx){
      int len=s.length();
      while ((startIdx < len) && Character.isWhitespace(s.charAt(startIdx))) {
        startIdx++;
      }
      return startIdx;
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
