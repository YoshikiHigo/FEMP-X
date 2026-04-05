package unverified;

public class ClonePair11492 {

    String method1(String inStr,String oldStr,String newStr){
      if (inStr == null || oldStr == null || newStr == null || oldStr.length() == 0) {
        return inStr;
      }
      String resultStr="";
      int pos=-1;
      boolean exitWhile=false;
      try {
        if (inStr != null && !inStr.equals("") && inStr.length() > 0) {
          while (!exitWhile) {
            pos=inStr.indexOf(oldStr);
            if (pos > 0) {
              resultStr+=inStr.substring(0,pos - 0) + newStr;
              inStr=inStr.substring(pos + oldStr.length());
            }
     else         if (pos == 0) {
              resultStr+=newStr;
              inStr=inStr.substring(pos + oldStr.length());
            }
     else         exitWhile=true;
          }
        }
      }
     catch (  Exception e) {
      }
      return resultStr + inStr;
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
