package all;

public class ClonePair8382 {

    int method1(String string,int p){
      while (p < string.length() && !Character.isWhitespace(string.charAt(p))) {
        p++;
      }
      return p;
    }

    int method2(String src,int from){
      for (final int len=src.length(); from < len && !Character.isWhitespace(src.charAt(from)); ++from)   ;
      return from;
    }
}
