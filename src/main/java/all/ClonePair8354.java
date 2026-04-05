package all;

public class ClonePair8354 {

    int method1(String text,int index){
      int text_len=text.length();
      while (index < text_len && Character.isWhitespace(text.charAt(index))) {
        index++;
      }
      return index;
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
