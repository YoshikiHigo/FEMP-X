package all;

public class ClonePair9071 {

    int method1(String sb,int offset){
      int result;
      for (result=offset; result < sb.length(); result++) {
        if (Character.isWhitespace(sb.charAt(result))) {
          break;
        }
      }
      return result;
    }

    int method2(String s,int pos){
      while (pos < s.length() && !Character.isWhitespace(s.charAt(pos)))   pos++;
      return pos;
    }
}
