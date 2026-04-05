package unverified;

public class ClonePair10595 {

    int method1(String sb,int offset){
      int result;
      for (result=offset; result < sb.length(); result++) {
        if (!Character.isWhitespace(sb.charAt(result))) {
          break;
        }
      }
      return result;
    }

    int method2(String src,int from){
      for (final int len=src.length(); from < len && Character.isWhitespace(src.charAt(from)); ++from)   ;
      return from;
    }
}
