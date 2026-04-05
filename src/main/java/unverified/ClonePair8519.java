package unverified;

public class ClonePair8519 {

    int method1(String source,int startIndex){
      int i;
      for (i=startIndex; i < source.length() && Character.isWhitespace(source.charAt(i)); i++) {
      }
      if (i >= source.length())   i=-1;
      return i;
    }

    int method2(String str,int fromIndex){
      for (int i=fromIndex; i < str.length(); i++) {
        char ch=str.charAt(i);
        if (!Character.isSpace(ch))     return i;
      }
      return -1;
    }
}
