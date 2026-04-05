package unverified;

public class ClonePair12580 {

    String method1(String str,String thisStr,String withThisStr){
      if ((str == null) || (thisStr == null) || (withThisStr == null)|| (str.length() == 0)|| (thisStr.length() == 0))   return str;
      for (int i=str.length() - 1; i >= 0; i--) {
        if (str.charAt(i) == thisStr.charAt(0))     if (str.substring(i).startsWith(thisStr)) {
          str=str.substring(0,i) + withThisStr + str.substring(i + thisStr.length());
          return str;
        }
      }
      return str;
    }

    String method2(String text,String key,String value){
      if (text == null)   return null;
      String buffer=text;
      if (buffer != null && key != null && value != null) {
        int length=key.length();
        for (int start=buffer.indexOf(key); start != -1; start=buffer.indexOf(key,start + value.length())) {
          buffer=buffer.substring(0,start) + value + buffer.substring(start + length);
        }
      }
      return buffer;
    }
}
