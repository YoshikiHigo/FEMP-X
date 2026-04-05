package all;

public class ClonePair8353 {

    int method1(String text,int index){
      int text_len=text.length();
      while (index < text_len && Character.isWhitespace(text.charAt(index))) {
        index++;
      }
      return index;
    }

    int method2(String s,int start){
      while ((start < s.length()) && Character.isWhitespace(s.charAt(start)))   start++;
      return start;
    }
}
