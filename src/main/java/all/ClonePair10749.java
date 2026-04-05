package all;

public class ClonePair10749 {

    int method1(String str,int startIndex){
      int i=startIndex;
      for (; i < str.length(); i++) {
        if (!Character.isWhitespace(str.charAt(i))) {
          break;
        }
      }
      return i;
    }

    int method2(String text,int pos){
      int result=pos;
      while (result < text.length() && text.charAt(result) == ' ') {
        result++;
      }
      return result;
    }
}
