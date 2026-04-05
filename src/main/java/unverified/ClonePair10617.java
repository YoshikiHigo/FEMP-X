package unverified;

public class ClonePair10617 {

    String method1(String old,String substring1,String substring2){
      StringBuffer returnBuffer=new StringBuffer();
      int len0=old.length();
      int len1=substring1.length();
      if (len1 > len0)   return new String(old);
     else {
        int exti=0;
        for (int i=0; i < len0 - len1 + 1; i++) {
          if (old.regionMatches(i,substring1,0,len1)) {
            returnBuffer.append(substring2);
            i+=len1 - 1;
          }
     else {
            returnBuffer.append(old.charAt(i));
          }
          exti=i;
        }
        for (int i=exti + 1; i < len0; i++) {
          returnBuffer.append(old.charAt(i));
        }
        return new String(returnBuffer);
      }
    }

    String method2(String str,String repl,String with){
      int lastindex=0;
      int pos=str.indexOf(repl);
      if (pos < 0) {
        return str;
      }
      int len=repl.length();
      int lendiff=with.length() - repl.length();
      StringBuilder out=new StringBuilder((lendiff <= 0) ? str.length() : (str.length() + (lendiff << 3)));
      for (; pos >= 0; pos=str.indexOf(repl,lastindex=pos + len)) {
        out.append(str.substring(lastindex,pos)).append(with);
      }
      return out.append(str.substring(lastindex,str.length())).toString();
    }
}
