package all;

public class ClonePair10860 {

    int method1(String text,int pos){
      int result=pos;
      while (result < text.length() && text.charAt(result) == ' ') {
        result++;
      }
      return result;
    }

    int method2(String s,int pos){
      while (pos < s.length() && Character.isWhitespace(s.charAt(pos)))   pos++;
      return pos;
    }
}
