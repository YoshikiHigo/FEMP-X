package all;

public class ClonePair8671 {

    int method1(String content,int fromIndex){
      while (fromIndex < content.length() && Character.isWhitespace(content.charAt(fromIndex))) {
        ++fromIndex;
      }
      return fromIndex;
    }

    int method2(String s,int startIdx){
      int len=s.length();
      while ((startIdx < len) && Character.isWhitespace(s.charAt(startIdx))) {
        startIdx++;
      }
      return startIdx;
    }
}
