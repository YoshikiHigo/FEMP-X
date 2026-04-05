package all;

public class ClonePair10748 {

    int method1(String str,int startIndex){
      int i=startIndex;
      for (; i < str.length(); i++) {
        if (!Character.isWhitespace(str.charAt(i))) {
          break;
        }
      }
      return i;
    }

    int method2(String src,int from){
      for (final int len=src.length(); from < len && Character.isWhitespace(src.charAt(from)); ++from)   ;
      return from;
    }
}
