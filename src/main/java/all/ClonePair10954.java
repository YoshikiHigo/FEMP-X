package all;

public class ClonePair10954 {

    String method1(String str,int length,String endStr){
      if (str == null) {
        return null;
      }
      String strReturn=str;
      int len=str.length();
      int asciiLen=0;
      for (int i=0; i < len; i++) {
        if (str.charAt(i) <= 255) {
          asciiLen++;
        }
      }
      if (asciiLen > 0) {
        len=len - asciiLen / 2;
      }
      if (len > length) {
        strReturn=str.substring(0,length) + endStr;
      }
      return strReturn;
    }

    String method2(String text,int len,String suffix){
      if (text != null) {
        if (text.length() > len) {
          return text.substring(0,len).trim() + suffix;
        }
      }
      return text;
    }
}
