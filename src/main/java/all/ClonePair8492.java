package all;

public class ClonePair8492 {

    int method1(String source,int startIndex){
      int i;
      for (i=startIndex; i < source.length() && Character.isWhitespace(source.charAt(i)); i++) {
      }
      if (i >= source.length())   i=-1;
      return i;
    }

    int method2(String json,int startFrom){
      int length=json.length();
      for (int i=startFrom; i < length; i++) {
        char curChar=json.charAt(i);
        if (Character.isWhitespace(curChar)) {
          continue;
        }
        return i;
      }
      return -1;
    }
}
