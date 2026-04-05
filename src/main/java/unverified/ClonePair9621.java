package unverified;

public class ClonePair9621 {

    int method1(String code,int offset){
      for (int i=offset; i < code.length(); i++) {
        if (!Character.isWhitespace(code.charAt(i))) {
          return i;
        }
      }
      return -1;
    }

    int method2(String str,int fromIndex){
      for (int i=fromIndex; i < str.length(); i++) {
        char ch=str.charAt(i);
        if (!Character.isSpace(ch))     return i;
      }
      return -1;
    }
}
