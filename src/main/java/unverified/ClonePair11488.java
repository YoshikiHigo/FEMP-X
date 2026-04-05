package unverified;

public class ClonePair11488 {

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

    String method2(String str,String match,String to){
      if ((str == null) || (match == null) || (to == null)) {
        return str;
      }
      StringBuffer dest=new StringBuffer();
      int len=match.length();
      String org=str;
      int index=org.indexOf(match);
      while (index != -1) {
        dest.append(org.substring(0,index));
        dest.append(to);
        org=org.substring(index + len);
        index=org.indexOf(match);
      }
      dest.append(org);
      return dest.toString();
    }
}
