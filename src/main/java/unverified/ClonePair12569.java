package unverified;

public class ClonePair12569 {

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
