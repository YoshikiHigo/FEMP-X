package all;

public class ClonePair13630 {

    String method1(CharSequence str){
      int len=str.length();
      if (len == 0)   return "";
      StringBuilder sbuf=null;
      int start=0;
      for (int i=0; ; i++) {
        int ch=i == len ? -1 : str.charAt(i);
        boolean sigma=ch == 0x3A3 || ch == 0x3C3 || ch == 0x3C2;
        if (ch < 0 || ch == 0x130 || ch == 0x131 || sigma) {
          if (sbuf == null && ch >= 0) {
            sbuf=new StringBuilder();
          }
          if (i > start) {
            String converted=(str.subSequence(start,i).toString().toUpperCase().toLowerCase());
            if (sbuf == null)         return converted;
            sbuf.append(converted);
          }
          if (ch < 0)       break;
          if (sigma)       ch=0x3c3;
          sbuf.append((char)ch);
          start=i + 1;
        }
      }
      return sbuf.toString();
    }

    String method2(CharSequence str){
      String result;
      int length=str.length();
      if (length > 0) {
        char ch=str.charAt(0);
        if (Character.isUpperCase(ch)) {
          StringBuilder buf=new StringBuilder(length);
          buf.append(Character.toLowerCase(ch));
          buf.append(str.subSequence(1,length));
          result=buf.toString();
        }
     else {
          result=str.toString();
        }
      }
     else {
        result=str.toString();
      }
      return result;
    }
}
