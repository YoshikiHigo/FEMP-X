package unverified;

public class ClonePair10616 {

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

    String method2(String text,String repl,String with){
      int c=0;
      int i=text.indexOf(repl,c);
      if (i == -1)   return text;
      StringBuffer buf=new StringBuffer(text.length() + with.length());
    synchronized (buf) {
        do {
          buf.append(text.substring(c,i));
          buf.append(with);
          c=i + repl.length();
        }
     while ((i=text.indexOf(repl,c)) != -1);
        if (c < text.length())     buf.append(text.substring(c,text.length()));
        return buf.toString();
      }
    }
}
