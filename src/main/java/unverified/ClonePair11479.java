package unverified;

public class ClonePair11479 {

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

    String method2(String str,String from,String to){
      int lenFrom;
      if (str == null) {
        return null;
      }
     else   if (from == null || (lenFrom=from.length()) == 0 || to == null) {
        return str;
      }
      StringBuffer buf=new StringBuffer(str);
      int lenTo=to.length();
      int pos=buf.indexOf(from);
      while (pos >= 0) {
        buf.replace(pos,pos + lenFrom,to);
        pos=buf.indexOf(from,pos + lenTo);
      }
      return buf.toString();
    }
}
