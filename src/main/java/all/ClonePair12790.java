package all;

import java.util.Locale;

public class ClonePair12790 {

    String method1(String str,boolean escapeAscii){
      StringBuffer ostr=new StringBuffer();
      for (int i=0; i < str.length(); i++) {
        char ch=str.charAt(i);
        if (!escapeAscii && ((ch >= 0x0020) && (ch <= 0x007e))) {
          ostr.append(ch);
        }
     else {
          ostr.append("\\u");
          String hex=Integer.toHexString(str.charAt(i) & 0xFFFF);
          if (hex.length() == 2)       ostr.append("00");
     else       if (hex.length() == 1)       ostr.append("000");
     else       if (hex.length() == 3)       ostr.append("0");
          ostr.append(hex.toUpperCase(Locale.ENGLISH));
        }
      }
      return ostr.toString();
    }

    String method2(String input,boolean escapeAscii){
      StringBuffer returnValue=new StringBuffer("");
      for (int i=0; i < input.length(); i++) {
        char ch=input.charAt(i);
        if (!escapeAscii && ((ch >= 0x0020) && (ch <= 0x007e))) {
          returnValue.append(ch);
        }
     else {
          returnValue.append("\\u");
          String hex=Integer.toHexString(input.charAt(i) & 0xFFFF);
          if (hex.length() == 2) {
            returnValue.append("00");
          }
          returnValue.append(hex.toUpperCase());
        }
      }
      return returnValue.toString();
    }
}
