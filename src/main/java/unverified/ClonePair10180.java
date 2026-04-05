package unverified;

public class ClonePair10180 {

    int method1(String s,int start){
      while ((start < s.length()) && Character.isWhitespace(s.charAt(start)))   start++;
      return start;
    }

    int method2(String src,int from){
      for (final int len=src.length(); from < len && Character.isWhitespace(src.charAt(from)); ++from)   ;
      return from;
    }
}
