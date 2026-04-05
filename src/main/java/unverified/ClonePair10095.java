package unverified;

public class ClonePair10095 {

    String method1(String str,String find,String replace){
      if (str == null)   return null;
      if ((find == null) || (find.length() == 0))   return str;
      if (replace == null)   replace="";
      StringBuffer sb=new StringBuffer(str.length());
      int pos=0;
      int lastPos=0;
      while (pos >= 0) {
        pos=str.indexOf(find,lastPos);
        if (pos >= 0) {
          sb.append(str.substring(lastPos,pos));
          sb.append(replace);
        }
     else {
          sb.append(str.substring(lastPos));
        }
        lastPos=pos + find.length();
      }
      return sb.toString();
    }

    String method2(String inStr,String oldStr,String newStr){
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
}
