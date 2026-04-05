package all;

public class ClonePair9517 {

    int method1(String string,int pos){
      final int length=string.length();
      while ((pos < length) && !Character.isWhitespace(string.charAt(pos))) {
        pos++;
      }
      return pos;
    }

    int method2(String src,int from){
      for (final int len=src.length(); from < len && !Character.isWhitespace(src.charAt(from)); ++from)   ;
      return from;
    }
}
