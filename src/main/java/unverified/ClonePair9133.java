package unverified;

public class ClonePair9133 {

    int method1(String s,int startIdx){
      int len=s.length();
      while ((startIdx < len) && Character.isWhitespace(s.charAt(startIdx))) {
        startIdx++;
      }
      return startIdx;
    }

    int method2(String src,int from){
      for (final int len=src.length(); from < len && Character.isWhitespace(src.charAt(from)); ++from)   ;
      return from;
    }
}
