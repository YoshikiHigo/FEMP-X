package all;

public class ClonePair11483 {

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

    String method2(String in,String old,String neww){
      int b=0;
      if (in == null || old == null || neww == null || (b=in.indexOf(old)) == -1 || old.length() == 0) {
        return in;
      }
      int oldLength=old.length();
      StringBuffer mod=new StringBuffer(in.length());
      mod.append(in.substring(0,b));
      int e=in.indexOf(old,b + oldLength);
      while (e != -1) {
        mod.append(neww);
        mod.append(in.substring(b + oldLength,e));
        b=e;
        e=in.indexOf(old,b + oldLength);
      }
      mod.append(neww);
      if (b < in.length()) {
        mod.append(in.substring(b + oldLength));
      }
      return mod.toString();
    }
}
