package unverified;

public class ClonePair9075 {

    int method1(String sb,int offset){
      int result;
      for (result=offset; result < sb.length(); result++) {
        if (Character.isWhitespace(sb.charAt(result))) {
          break;
        }
      }
      return result;
    }

    int method2(String string,int pos){
      final int length=string.length();
      while ((pos < length) && !Character.isWhitespace(string.charAt(pos))) {
        pos++;
      }
      return pos;
    }
}
