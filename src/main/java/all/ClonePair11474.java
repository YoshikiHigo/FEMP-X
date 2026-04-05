package all;

public class ClonePair11474 {

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

    String method2(String src,String from,String to){
      StringBuffer res_Buff=new StringBuffer();
      int pos=-1;
      if (src == null || from == null || from.equals(""))   return src;
      if (to == null)   to="";
      while (true) {
        if ((pos=src.indexOf(from)) == -1) {
          res_Buff.append(src);
          break;
        }
        res_Buff.append(src.substring(0,pos)).append(to);
        src=src.substring(pos + from.length());
      }
      return res_Buff.toString();
    }
}
