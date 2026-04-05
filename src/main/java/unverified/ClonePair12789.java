package unverified;

import java.util.Locale;

public class ClonePair12789 {

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

    String method2(String str,boolean escapeAscii){
      String ostr=new String();
      for (int i=0; i < str.length(); i++) {
        char ch=str.charAt(i);
        if (!escapeAscii && ((ch >= 0x0020) && (ch <= 0x007e)))     ostr+=ch;
     else {
          ostr+="\\u";
          String hex=Integer.toHexString(str.charAt(i) & 0xFFFF);
          if (hex.length() == 2)       ostr+="00";
          ostr+=hex.toUpperCase(Locale.ENGLISH);
        }
      }
      return (ostr);
    }
}
