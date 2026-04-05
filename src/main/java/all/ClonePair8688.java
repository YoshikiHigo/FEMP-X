package all;

public class ClonePair8688 {

    int method1(String content,int fromIndex){
      while (fromIndex < content.length() && Character.isWhitespace(content.charAt(fromIndex))) {
        ++fromIndex;
      }
      return fromIndex;
    }

    int method2(String template,int i){
      while (i < template.length() && Character.isWhitespace(template.charAt(i))) {
        i++;
      }
      return i;
    }
}
