package unverified;

public class ClonePair8508 {

    int method1(String source,int startIndex){
      int i;
      for (i=startIndex; i < source.length() && Character.isWhitespace(source.charAt(i)); i++) {
      }
      if (i >= source.length())   i=-1;
      return i;
    }

    int method2(String code,int offset){
      for (int i=offset; i < code.length(); i++) {
        if (!Character.isWhitespace(code.charAt(i))) {
          return i;
        }
      }
      return -1;
    }
}
