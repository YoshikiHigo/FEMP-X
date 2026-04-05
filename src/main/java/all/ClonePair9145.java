package all;

public class ClonePair9145 {

    int method1(String s,int pos){
      while (pos < s.length() && !Character.isWhitespace(s.charAt(pos)))   pos++;
      return pos;
    }

    int method2(String src,int from){
      for (final int len=src.length(); from < len && !Character.isWhitespace(src.charAt(from)); ++from)   ;
      return from;
    }
}
