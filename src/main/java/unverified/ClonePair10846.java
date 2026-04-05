package unverified;

public class ClonePair10846 {

    int method1(String src,int from){
      for (final int len=src.length(); from < len && Character.isWhitespace(src.charAt(from)); ++from)   ;
      return from;
    }

    int method2(String text,int pos){
      int result=pos;
      while (result < text.length() && text.charAt(result) == ' ') {
        result++;
      }
      return result;
    }
}
