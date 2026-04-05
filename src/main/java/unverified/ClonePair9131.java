package unverified;

public class ClonePair9131 {

    int method1(String s,int startIdx){
      int len=s.length();
      while ((startIdx < len) && Character.isWhitespace(s.charAt(startIdx))) {
        startIdx++;
      }
      return startIdx;
    }

    int method2(String str,int startIndex){
      int i=startIndex;
      for (; i < str.length(); i++) {
        if (!Character.isWhitespace(str.charAt(i))) {
          break;
        }
      }
      return i;
    }
}
