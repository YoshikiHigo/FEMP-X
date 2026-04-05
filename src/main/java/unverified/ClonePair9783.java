package unverified;

public class ClonePair9783 {

    int method1(String s,int i){
      int j=i;
      while (j < s.length() && Character.isWhitespace(s.charAt(j))) {
        ++j;
      }
      return j;
    }

    int method2(String text,int pos){
      int result=pos;
      while (result < text.length() && text.charAt(result) == ' ') {
        result++;
      }
      return result;
    }
}
