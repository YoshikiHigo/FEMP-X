package all;

public class ClonePair12451 {

    String method1(String string,boolean startsParagraph){
      String trimmed;
      if (startsParagraph) {
        int len=string.length() - 1;
        while ((len >= 0) && (string.charAt(len) <= ' ')) {
          len--;
        }
        if (len <= 0) {
          trimmed=string;
        }
     else {
          trimmed=string.substring(0,len + 1);
        }
      }
     else {
        trimmed=string.trim();
      }
      return trimmed;
    }

    String method2(String str,boolean trimSpace){
      int startLen=str.length();
      int endLen=startLen;
      if (endLen > 0 && str.charAt(endLen - 1) == '\n') {
        endLen--;
      }
      if (trimSpace && endLen > 0 && str.charAt(endLen - 1) == ' ') {
        endLen--;
      }
      return (endLen != startLen) ? str.substring(0,endLen) : str;
    }
}
