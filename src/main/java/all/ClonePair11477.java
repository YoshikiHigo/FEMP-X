package all;

public class ClonePair11477 {

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

    String method2(String s,String s1,String s2){
      if ("".equals(s1) || "".equals(s) || s == null || s1 == null || s2 == null)   return s;
      StringBuffer stringbuffer=null;
      int j=0;
      int i;
      while ((i=s.indexOf(s1,j)) != -1) {
        String s4=s.substring(j,i);
        j=i + s1.length();
        if (stringbuffer == null)     stringbuffer=new StringBuffer(s2.length());
        stringbuffer.append(s4);
        stringbuffer.append(s2);
      }
      return stringbuffer != null ? stringbuffer.append(s.substring(j)).toString() : s;
    }
}
