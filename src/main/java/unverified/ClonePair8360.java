package unverified;

public class ClonePair8360 {

    int method1(String text,int index){
      int text_len=text.length();
      while (index < text_len && Character.isWhitespace(text.charAt(index))) {
        index++;
      }
      return index;
    }

    int method2(String text,int pos){
      int result=pos;
      while (result < text.length() && text.charAt(result) == ' ') {
        result++;
      }
      return result;
    }
}
