package unverified;

public class ClonePair10600 {

    int method1(String sb,int offset){
      int result;
      for (result=offset; result < sb.length(); result++) {
        if (!Character.isWhitespace(sb.charAt(result))) {
          break;
        }
      }
      return result;
    }

    int method2(String rawdata,int i){
      int length=rawdata.length();
      while ((i < length) && Character.isWhitespace(rawdata.charAt(i)))   i++;
      return i;
    }
}
