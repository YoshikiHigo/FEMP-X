package all;

public class ClonePair11484 {

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

    String method2(String text,String expr,String replaceSting){
      if (text == null) {
        return text;
      }
      if (expr == null) {
        return text;
      }
      if (replaceSting == null) {
        return text;
      }
      if (text.equals("")) {
        return text;
      }
      if (expr.equals("")) {
        return text;
      }
      if (text.indexOf(expr) == -1) {
        return text;
      }
      String vAfter=text;
      StringBuffer buf=new StringBuffer();
      while (vAfter.indexOf(expr) != -1) {
        String vBefor=vAfter.substring(0,vAfter.indexOf(expr));
        vAfter=vAfter.substring(vAfter.indexOf(expr) + expr.length());
        buf.append(vBefor).append(replaceSting);
      }
      buf.append(vAfter);
      text=buf.toString();
      return text;
    }
}
