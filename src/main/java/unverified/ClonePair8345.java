package unverified;

public class ClonePair8345 {

    int method1(String text,int index){
      int text_len=text.length();
      while (index < text_len && Character.isWhitespace(text.charAt(index))) {
        index++;
      }
      return index;
    }

    int method2(String s,int startIdx){
      int len=s.length();
      while ((startIdx < len) && Character.isWhitespace(s.charAt(startIdx))) {
        startIdx++;
      }
      return startIdx;
    }
}
