package unverified;

public class ClonePair9496 {

    int method1(String rawdata,int i){
      int length=rawdata.length();
      if (i < length) {
        char c=rawdata.charAt(i);
        while ((i < length) && Character.isWhitespace(c)) {
          ++i;
          c=rawdata.charAt(i);
        }
      }
      return i;
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
