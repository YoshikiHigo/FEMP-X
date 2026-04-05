package all;

public class ClonePair10861 {

    int method1(String text,int pos){
      int result=pos;
      while (result < text.length() && text.charAt(result) == ' ') {
        result++;
      }
      return result;
    }

    int method2(String template,int i){
      while (i < template.length() && Character.isWhitespace(template.charAt(i))) {
        i++;
      }
      return i;
    }
}
