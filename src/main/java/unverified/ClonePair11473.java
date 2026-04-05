package unverified;

public class ClonePair11473 {

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

    String method2(String data,String oldS,String newS){
      if (data == null)   return null;
      if (oldS == null || newS == null)   return data;
      StringBuffer buf=new StringBuffer(data.length());
      int pos=-1;
      int i=0;
      while ((pos=data.indexOf(oldS,i)) != -1) {
        buf.append(data.substring(i,pos)).append(newS);
        i=pos + oldS.length();
      }
      buf.append(data.substring(i));
      return buf.toString();
    }
}
