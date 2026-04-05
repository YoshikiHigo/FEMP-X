package all;

public class ClonePair8340 {

    int method1(String text,int index){
      int text_len=text.length();
      while (index < text_len && Character.isWhitespace(text.charAt(index))) {
        index++;
      }
      return index;
    }

    int method2(String s,int start){
      int limit=s.length();
      int i=start;
      for (; i < limit; i++) {
        if (s.charAt(i) != ' ') {
          break;
        }
      }
      return i;
    }
}
