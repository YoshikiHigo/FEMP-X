package unverified;

public class ClonePair8677 {

    int method1(String content,int fromIndex){
      while (fromIndex < content.length() && Character.isWhitespace(content.charAt(fromIndex))) {
        ++fromIndex;
      }
      return fromIndex;
    }

    int method2(String sb,int offset){
      int result;
      for (result=offset; result < sb.length(); result++) {
        if (!Character.isWhitespace(sb.charAt(result))) {
          break;
        }
      }
      return result;
    }
}
