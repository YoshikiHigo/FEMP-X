package all;

public class ClonePair8516 {

    int method1(String source,int startIndex){
      int i;
      for (i=startIndex; i < source.length() && Character.isWhitespace(source.charAt(i)); i++) {
      }
      if (i >= source.length())   i=-1;
      return i;
    }

    int method2(String str,int pos){
      for (; pos < str.length(); pos++) {
        char c=str.charAt(pos);
        if (!(c == ' ' || c == '\t')) {
          return pos;
        }
      }
      return -1;
    }
}
